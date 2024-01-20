package com.nobroker.controller;

import com.nobroker.payload.OwnerPlanDto;
import com.nobroker.service.OwnerPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ownerPlan")
public class OwnerPlanController {

    private final OwnerPlanService ownerPlanService;

    @Autowired
    public OwnerPlanController(OwnerPlanService ownerPlanService) {
        this.ownerPlanService = ownerPlanService;
    }

    @PostMapping
    public ResponseEntity<OwnerPlanDto> createOwnerPlan(@RequestBody OwnerPlanDto ownerPlanDto) {

        OwnerPlanDto createdOwnerPlan = ownerPlanService.createOwnerPlans(ownerPlanDto);

        return ResponseEntity.ok(createdOwnerPlan);
    }
    @GetMapping
    public List<OwnerPlanDto> getAllOwnerPlans(){
       return ownerPlanService.getAllOwnerPlans();
    }
}
