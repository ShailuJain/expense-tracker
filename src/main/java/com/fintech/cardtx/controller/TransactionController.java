package com.fintech.cardtx.controller;

import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import com.fintech.cardtx.dto.TransactionRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class TransactionController {
    @PostMapping("api/transactions")
    public ResponseEntity<String> postTransaction(@Valid @RequestBody TransactionRequest transactionRequest) {
        return ResponseEntity.ok("Transaction received: " + transactionRequest);
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}