package com.capg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Transactions;



public interface TransactionsRepo extends JpaRepository<Transactions, Integer> {

	Optional<Transactions> findByTransactionId(int transactionId);

}
