package com.example.demo.Controller;

import com.example.demo.Service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

    @Autowired
    PolicyService policyService;

    public static final String URI = "/policy/{policyNumber}";

    @RequestMapping(URI)
    public String getPolicy(@PathVariable final int policyNumber) {
        return policyService.getPolicy(policyNumber);
    }
}
