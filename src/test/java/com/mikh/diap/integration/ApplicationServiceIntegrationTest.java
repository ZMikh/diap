package com.mikh.diap.integration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mikh.diap.adapter.rest.dto.ApplicationResponseDto;
import com.mikh.diap.adapter.rest.dto.CreateApplicationRequestDto;
import com.mikh.diap.adapter.rest.dto.CreateApplicationResponseDto;
import com.mikh.diap.adapter.rest.dto.UpdateApplicationRequestDto;
import com.mikh.diap.domain.ApplicationState;
import com.mikh.diap.domain.ApplicationType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ApplicationServiceIntegrationTest extends IntegrationAbstractTest {
    private CreateApplicationRequestDto createRequestDto;
    private CreateApplicationResponseDto createResponseDto;
    private final TypeReference<List<ApplicationResponseDto>> listTypeReference = new TypeReference<>() {
    };

    @BeforeEach
    void setUp() throws Exception {
        createRequestDto = CreateApplicationRequestDto.builder()
                .firstname("Иванов")
                .lastname("Иван")
                .middlename("Иванович")
                .applicationType(ApplicationType.MASS.toString())
                .huntingLicenseNumber(1454848L)
                .huntingLicenseSeries("HH")
                .huntingLicenseDateOfIssue(LocalDate.of(2023, 9, 1))
                .count(1)
                .build();

        createResponseDto = performCreateApplication(1L, createRequestDto, CreateApplicationResponseDto.class);
    }

    @Test
    void couldCreateAnApplication() {
        assertThat(createResponseDto.id()).isNotNull();
    }

    @Test
    void couldGetAnApplicationByItsId() throws Exception {
        ApplicationResponseDto dto = performGetApplicationById(createResponseDto.id(), ApplicationResponseDto.class);
        assertThat(dto.huntingLicenseNumber()).isEqualTo(1454848L);
    }

    @Test
    void couldGetAllApplications() throws Exception {
        List<ApplicationResponseDto> dtos = performGetApplications(listTypeReference);
        assertThat(dtos.size()).isGreaterThan(90);
    }

    @Test
    void couldUpdateAnApplicationByItsId() throws Exception {
        // arrange
        UpdateApplicationRequestDto updateApplicationRequestDto = new UpdateApplicationRequestDto(ApplicationState.APPROVED.toString());

        // act
        ApplicationResponseDto dto = performUpdateApplication(createResponseDto.id(), updateApplicationRequestDto, ApplicationResponseDto.class);

        // assertions
        assertThat(dto.applicationState()).isEqualTo(ApplicationState.APPROVED.toString());
    }

    @Test
    void couldDeleteAnApplicationByItsId() throws Exception {
        MvcResult mvcResult = performDeleteApplicationById(createResponseDto.id());
        assertThat(mvcResult.getResponse().getContentAsString()).contains(createResponseDto.id() + " is deleted");
    }

    @Test
    void couldCheckRequestedApplicationExistence() throws Exception {
        // arrange
        performDeleteApplicationById(createResponseDto.id());

        // act
        ResultActions resultActions = performExceptionOnNotFoundApplication(createResponseDto.id(), status().isNotFound());

        // assertions
        assertThat(resultActions.andReturn().getResponse().getContentAsString()).isEqualTo("Requested application doesn't exist");
    }

    @Test
    void couldCheckEmptyOrNullFields() throws Exception {
        // arrange
        CreateApplicationRequestDto createHuntingLicenceNumberMissingRequestDto = CreateApplicationRequestDto.builder()
                .firstname("Иванов")
                .lastname("Иван")
                .middlename("Иванович")
                .applicationType(ApplicationType.MASS.toString())
                .huntingLicenseSeries("HH")
                .huntingLicenseDateOfIssue(LocalDate.of(2023, 9, 1))
                .count(1)
                .build();

        // act
        ResultActions resultActions = performExceptionOnApplicationCreation(2L, createHuntingLicenceNumberMissingRequestDto, status().isBadRequest());

        // assertions
        assertThat(resultActions.andReturn().getResponse().getContentAsString()).isEqualTo("Fill in all the required fields");
    }

    @Test
    void couldStartApplicationApproval() throws Exception {
        assertThat(repository.findById(1L).orElseThrow().getApplicationState()).isEqualTo(ApplicationState.CREATED);
        assertThat(repository.findById(61L).orElseThrow().getApplicationState()).isEqualTo(ApplicationState.CREATED);

        performToggleJob();

        Thread.sleep(5000);
        ApplicationResponseDto responseDto = performGetApplicationById(createResponseDto.id(), ApplicationResponseDto.class);

        // assertions
        assertThat(responseDto.applicationState()).isNotEqualTo(ApplicationState.CREATED.toString());
        assertThat(repository.findById(1L).orElseThrow().getApplicationState()).isEqualTo(ApplicationState.APPROVED);
        assertThat(repository.findById(61L).orElseThrow().getApplicationState()).isEqualTo(ApplicationState.REJECTED);
    }
}
