package com.example.gemini13.controller;

import com.example.gemini13.model.SciencePlan;
import com.example.gemini13.service.SciencePlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scienceplans")
public class SciencePlanController {

    private final SciencePlanService service;

    public SciencePlanController(SciencePlanService service) {
        this.service = service;
    }

    // 创建科学计划接口
    @PostMapping("/create")
    public ResponseEntity<SciencePlan> createSciencePlan(@RequestBody SciencePlan plan) {
        SciencePlan createdPlan = service.createSciencePlan(plan);
        return ResponseEntity.ok(createdPlan);
    }

    // 获取所有科学计划接口（可选）
    @GetMapping("/all")
    public ResponseEntity<List<SciencePlan>> getAllPlans() {
        List<SciencePlan> plans = service.getAllPlans();
        return ResponseEntity.ok(plans);
    }
}
