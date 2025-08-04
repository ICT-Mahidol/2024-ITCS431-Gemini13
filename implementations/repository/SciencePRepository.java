package com.example.gemini13.repository;

import com.example.gemini13.model.SciencePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SciencePlanRepository extends JpaRepository<SciencePlan, Long> {
   
}
