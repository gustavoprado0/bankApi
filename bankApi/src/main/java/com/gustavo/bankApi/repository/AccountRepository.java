package com.gustavo.bankApi.repository;

import com.gustavo.bankApi.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}