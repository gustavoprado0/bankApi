package com.gustavo.bankApi.controller;

import com.gustavo.bankApi.model.Account;
import com.gustavo.bankApi.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountRepository repository;

    public AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return repository.save(account);
    }
}