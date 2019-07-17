package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CriminalCaseRepository extends JpaRepository<CriminalCase,Integer> {
    List<CriminalCase> findByOrderByTimeDesc();
    List<CriminalCase> findAllByCaseName(String caseName);
}
