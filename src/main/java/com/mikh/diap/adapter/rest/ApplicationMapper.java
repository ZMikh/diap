package com.mikh.diap.adapter.rest;

import com.mikh.diap.adapter.rest.dto.ApplicationResponseDto;
import com.mikh.diap.adapter.rest.dto.CreateApplicationRequestDto;
import com.mikh.diap.adapter.rest.dto.CreateApplicationResponseDto;
import com.mikh.diap.adapter.rest.dto.UpdateApplicationRequestDto;
import com.mikh.diap.app.api.inbound.UpdateApplicationRequest;
import com.mikh.diap.app.exception.ApplicationInformationException;
import com.mikh.diap.domain.HuntingApplication;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
    List<ApplicationResponseDto> toApplicationListDto(List<HuntingApplication> applications);

    ApplicationResponseDto toApplicationDto(HuntingApplication application);

    @Mapping(target = "applicationState", constant = "CREATED")
    HuntingApplication toApplication(CreateApplicationRequestDto dto) throws ApplicationInformationException;

    CreateApplicationResponseDto toCreateResponseDto(HuntingApplication application);

    UpdateApplicationRequest toUpdateRequest(UpdateApplicationRequestDto dto);
}
