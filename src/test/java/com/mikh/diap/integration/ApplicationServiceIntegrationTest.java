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

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationServiceIntegrationTest extends IntegrationAbstractTest {
    private CreateApplicationRequestDto createRequestDto;
    private CreateApplicationResponseDto createResponseDto;
    private final TypeReference<List<ApplicationResponseDto>> listTypeReference = new TypeReference<List<ApplicationResponseDto>>() {
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
        UpdateApplicationRequestDto updateApplicationRequestDto = new UpdateApplicationRequestDto(ApplicationState.APPROVED.toString());
        ApplicationResponseDto dto = performUpdateApplication(createResponseDto.id(), updateApplicationRequestDto, ApplicationResponseDto.class);
        assertThat(dto.applicationState()).isEqualTo(ApplicationState.APPROVED.toString());
    }

    @Test
    void couldDeleteAnApplicationByItsId() throws Exception {
        MvcResult mvcResult = performDeleteApplicationById(createResponseDto.id());
        assertThat(mvcResult.getResponse().getContentAsString()).contains(createResponseDto.id() + " is deleted");
    }
}
