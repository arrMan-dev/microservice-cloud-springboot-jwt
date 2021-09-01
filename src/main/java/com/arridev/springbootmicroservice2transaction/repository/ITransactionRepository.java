package com.arridev.springbootmicroservice2transaction.repository;

import com.arridev.springbootmicroservice2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author arrisdev
 * @date 09.02.2021
 * @time 11:23
 */
public interface ITransactionRepository extends JpaRepository<Transaction, Long>
{
    List<Transaction> findAllByUserId(Long userId);
}
