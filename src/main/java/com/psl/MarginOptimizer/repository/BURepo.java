package com.psl.MarginOptimizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psl.MarginOptimizer.entity.BUClass;

@Repository
public interface BURepo extends JpaRepository < BUClass, Integer > {
    
}