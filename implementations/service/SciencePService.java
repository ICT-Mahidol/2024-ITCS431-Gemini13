package com.example.gemini13.service;

import com.example.gemini13.model.SciencePlan;
import com.example.gemini13.repository.SciencePlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SciencePlanService {

    private final SciencePlanRepository repository;

    public SciencePlanService(SciencePlanRepository repository) {
        this.repository = repository;
    }

   
    public SciencePlan createSciencePlan(SciencePlan plan) {
        return repository.save(plan);
    }

 
    public List<SciencePlan> getAllPlans() {
        return repository.findAll();
    }
}
