package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MainControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        MvcResult mockReturn = mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andReturn();

        assertThat(mockReturn.getResponse().getContentAsString()).isEqualTo("test1");
    }

    @Test
    public void test2() throws Exception {
        MvcResult mockReturn = mockMvc.perform(get("/test"))
                .andExpect(status().isOk())
                .andReturn();

        assertThat(mockReturn.getResponse().getContentAsString()).isEqualTo("test2");
    }
}
