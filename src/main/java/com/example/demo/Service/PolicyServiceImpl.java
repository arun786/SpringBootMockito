package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService {
    @Override
    public String getPolicy(int policyNumber) {
        return policyNumber < 6 ? "arun" : "sachin";
    }
}
