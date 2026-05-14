package com.gustavo.bankApi.service;

import com.gustavo.bankApi.dto.DepositDTO;
import com.gustavo.bankApi.model.Account;
import com.gustavo.bankApi.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

   public Account deposit(UUID accountId, DepositDTO dto) {
        Account account = repository.findById(accountId).orElseThrow(() -> new RuntimeException("Conta não encontrada"));

        account.setBalance(
                account.getBalance().add(dto.amount)
        );

        return repository.save(account);
   }
}