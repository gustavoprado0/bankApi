package com.gustavo.bankApi.controller;

import com.gustavo.bankApi.dto.DepositDTO;
import com.gustavo.bankApi.model.Account;
import com.gustavo.bankApi.service.AccountService;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping("/{id}/deposit")
    public Account deposit(@PathVariable UUID id, @RequestBody DepositDTO dto) {
        return service.deposit(id, dto);
    }
}