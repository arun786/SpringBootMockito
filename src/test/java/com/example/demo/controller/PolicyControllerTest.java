package com.example.demo.controller;

import com.example.demo.Controller.PolicyController;
import com.example.demo.Service.PolicyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PolicyController.class)
public class PolicyControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private PolicyService policyService;

    @Test
    public void getPolicyTest() throws Exception {
        final int policyNumber = 5;
        given(policyService.getPolicy(policyNumber)).willReturn("arun");
        mvc.perform(get(PolicyController.URI, policyNumber).accept(MediaType.APPLICATION_JSON_UTF8)).andExpect(status().is2xxSuccessful()).andExpect(content().string("arun"));
    }
}
