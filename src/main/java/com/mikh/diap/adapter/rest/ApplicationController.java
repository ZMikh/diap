package com.mikh.diap.adapter.rest;

import com.mikh.diap.adapter.rest.dto.ApplicationResponseDto;
import com.mikh.diap.adapter.rest.dto.CreateApplicationRequestDto;
import com.mikh.diap.adapter.rest.dto.CreateApplicationResponseDto;
import com.mikh.diap.adapter.rest.dto.UpdateApplicationRequestDto;
import com.mikh.diap.app.api.inbound.ApplicationService;
import com.mikh.diap.app.api.inbound.UpdateApplicationRequest;
import com.mikh.diap.domain.HuntingApplication;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/application")
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService service;
    private final ApplicationMapper mapper;

    @Operation(summary = "Get all applications")
    @GetMapping
    public List<ApplicationResponseDto> getAll() {
        List<HuntingApplication> applications = service.getAll();
        return mapper.toApplicationListDto(applications);
    }

    @Operation(summary = "Get an application by its id")
    @GetMapping("/{id}")
    public ApplicationResponseDto getApplicationById(@Parameter(description = "id of application to be searched")
                                                     @PathVariable Long id) {
        HuntingApplication application = service.getApplicationById(id);
        return mapper.toApplicationDto(application);
    }

    @Operation(summary = "Add an application")
    @PostMapping("/add/{id}")
    public CreateApplicationResponseDto addApplication(@Parameter(description = "id of resource to be requested")
                                                       @PathVariable Long id,
                                                       @RequestBody CreateApplicationRequestDto createApplicationRequestDto) {
        HuntingApplication application = mapper.toApplication(createApplicationRequestDto);
        HuntingApplication addedApplication = service.addApplication(id, application);
        return mapper.toCreateResponseDto(addedApplication);
    }

    @Operation(summary = "Update an application by its id")
    @PutMapping("/update-by-id/{id}")
    public ApplicationResponseDto updateApplication(@Parameter(description = "id of application to be updated")
                                                    @PathVariable Long id,
                                                    @RequestBody UpdateApplicationRequestDto updateApplicationRequestDto) {
        UpdateApplicationRequest request = mapper.toUpdateRequest(updateApplicationRequestDto);
        HuntingApplication application = service.updateApplication(id, request);
        return mapper.toApplicationDto(application);
    }

    @Operation(summary = "Delete an application by its id")
    @DeleteMapping("/delete-by-id/{id}")
    public String deleteApplicationById(@Parameter(description = "id of application to be deleted")
                                        @PathVariable Long id) {
        service.deleteApplicationById(id);
        return "Hunting application with id: " + id + " is deleted";
    }
}
