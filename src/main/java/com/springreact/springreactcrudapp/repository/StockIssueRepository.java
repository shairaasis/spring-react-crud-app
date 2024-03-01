package com.springreact.springreactcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.springreactcrudapp.model.StockIssue;

public interface StockIssueRepository extends JpaRepository<StockIssue, Long>{

    
} 