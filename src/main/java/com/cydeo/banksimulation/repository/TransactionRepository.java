package com.cydeo.banksimulation.repository;

import com.cydeo.banksimulation.dto.TransactionDTO;
import com.cydeo.banksimulation.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {



//    public List<TransactionDTO> retrieveLastTransactions() {
//        return transactionDTOList.stream().
//                sorted(Comparator.comparing(TransactionDTO::getCreationDate)).limit(10).collect(Collectors.toList());
//    }
//
//    public List<TransactionDTO> findTransactionListById(UUID id) {
//        return transactionDTOList.stream().filter(transactionDTO -> transactionDTO.getSender().equals(id) || transactionDTO.getReceiver().equals(id))
//                .collect(Collectors.toList());
//    }
}
