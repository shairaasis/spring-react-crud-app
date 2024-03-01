package com.springreact.springreactcrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.springreactcrudapp.exception.UserNotFoundException;
import com.springreact.springreactcrudapp.model.StockIssue;
import com.springreact.springreactcrudapp.repository.StockIssueRepository;

@RestController
@RequestMapping("/stockissues")
@CrossOrigin("https://shaira-dev-ed.develop.lightning.force.com")
public class StockIssueController {
    @Autowired
    private StockIssueRepository stockIssueRepository;

    @GetMapping("stockissue/{id}")
    StockIssue getUserByIdWithoutRequestParam(@PathVariable("id") Long id) {
        return stockIssueRepository.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }

    @PostMapping("/save")
    StockIssue newStockIssue(@RequestBody StockIssue newIssue){
        return stockIssueRepository.save(newIssue);
    }

    @GetMapping("/all")
    public List<StockIssue> getAllStockIssue() {
        return stockIssueRepository.findAll();
    }

}
