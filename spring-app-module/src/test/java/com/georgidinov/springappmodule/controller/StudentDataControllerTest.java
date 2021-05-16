package com.georgidinov.springappmodule.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class StudentDataControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        StudentDataController studentDataController = new StudentDataController();
        this.mockMvc = MockMvcBuilders.standaloneSetup(studentDataController).build();
    }

    @Test
    void studentData() throws Exception {
        mockMvc.perform(get("http://localhost:8080"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.student_name", equalTo("Georgi Dinov")))
                .andExpect(jsonPath("$.faculty_number", equalTo("2001717005")));
    }

    @Test
    void studentDataBadRequest() throws Exception {
        mockMvc.perform(get("http://localhost:8080/something"))
                .andExpect(status().is4xxClientError());
    }
}