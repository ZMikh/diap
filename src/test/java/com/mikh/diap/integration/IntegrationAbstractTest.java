package com.mikh.diap.integration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mikh.diap.adapter.rest.dto.CreateApplicationRequestDto;
import com.mikh.diap.adapter.rest.dto.UpdateApplicationRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.lifecycle.Startables;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@WebAppConfiguration
class IntegrationAbstractTest {
    @Autowired
    protected MockMvc mockMvc;
    @Autowired
    protected ObjectMapper objectMapper;
    private static final String API = "/api/v1/application";
    public static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:15-alpine");

    @DynamicPropertySource
    static void properties(DynamicPropertyRegistry registry) {
        Startables.deepStart(postgreSQLContainer).join();

        registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
        registry.add("spring.datasource.password", postgreSQLContainer::getPassword);
        registry.add("spring.datasource.username", postgreSQLContainer::getUsername);
    }


    protected <T> T performCreateApplication(Long id, CreateApplicationRequestDto requestBody, Class<T> response) throws Exception {
        ResultActions resultActions = mockMvc.perform(post(API + "/add/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestBody)))
                .andDo(print())
                .andExpect(status().isOk());
        return objectMapper.readValue(resultActions.andReturn().getResponse().getContentAsString(), response);
    }

    protected <T> T performGetApplications(TypeReference<T> response) throws Exception {
        ResultActions resultActions = mockMvc.perform(get(API)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        return objectMapper.readValue(resultActions.andReturn().getResponse().getContentAsString(), response);
    }

    protected <T> T performGetApplicationById(Long id, Class<T> response) throws Exception {
        ResultActions resultActions = mockMvc.perform(get(API + "/" + id)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
        return objectMapper.readValue(resultActions.andReturn().getResponse().getContentAsString(), response);
    }

    protected MvcResult performDeleteApplicationById(Long id) throws Exception {
        return mockMvc.perform(delete(API + "/delete-by-id/" + id)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }

    protected <T> T performUpdateApplication(Long id, UpdateApplicationRequestDto requestBody, Class<T> response) throws Exception {
        ResultActions resultActions = mockMvc.perform(put(API + "/update-by-id/" + id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(requestBody)))
                .andDo(print())
                .andExpect(status().isOk());
        return objectMapper.readValue(resultActions.andReturn().getResponse().getContentAsString(), response);
    }
}
