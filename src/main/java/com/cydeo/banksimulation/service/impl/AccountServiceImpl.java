package com.cydeo.banksimulation.service.impl;

import com.cydeo.banksimulation.enums.AccountStatus;
import com.cydeo.banksimulation.dto.AccountDTO;
import com.cydeo.banksimulation.enums.AccountType;
import com.cydeo.banksimulation.mapper.AccountMapper;
import com.cydeo.banksimulation.repository.AccountRepository;
import com.cydeo.banksimulation.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;



@Service
public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;

    AccountMapper accountMapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public List<AccountDTO> listAllAccount() {

        return accountRepository.findAll();
    }

    @Override
    public void createNewAccount(AccountDTO accountDTO) {

        return accountRepository.save(accountDTO);
    }



    @Override
    public List<AccountDTO> listAllActiveAccount() {
        return null;
    }

    @Override
    public void deleteAccount(Long accountId) {
        AccountDTO accountDTO = accountRepository.findById(accountId);
        accountDTO.setAccountStatus(AccountStatus.DELETED);
        accountRepository.deleteAccount(accountDTO);

    }

    @Override
    public AccountDTO retrieveById(Long account) {
        return accountRepository.findById(account);
    }


}
