package com.example.simple_math_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testCalculateSumWithPositiveNumbers() throws Exception {
        mockMvc.perform(get("/sum")
                        .param("a", "10")
                        .param("b", "20"))
                .andExpect(status().isOk())
                .andExpect(content().string("30"));
    }

    @Test
    void testCalculateSumWithNegativeNumbers() throws Exception {
        mockMvc.perform(get("/sum")
                        .param("a", "-10")
                        .param("b", "-20"))
                .andExpect(status().isOk())
                .andExpect(content().string("-30"));
    }

    @Test
    void testCalculateSumWithZero() throws Exception {
        mockMvc.perform(get("/sum")
                        .param("a", "0")
                        .param("b", "0"))
                .andExpect(status().isOk())
                .andExpect(content().string("0"));
    }
}
