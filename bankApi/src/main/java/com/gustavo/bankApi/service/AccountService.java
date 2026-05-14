package com.gustavo.bankApi.service;

import com.gustavo.bankApi.model.Account;
import com.gustavo.bankApi.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account createAccount(Account account) {
        account.setBalance(
                account.getBalance() == null ?
                        java.math.BigDecimal.ZERO :
                        account.getBalance()
        );

        return repository.save(account);
    }
}