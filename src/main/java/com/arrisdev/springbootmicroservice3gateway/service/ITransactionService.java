package com.arrisdev.springbootmicroservice3gateway.service;

import com.google.gson.JsonElement;

import java.util.List;

/**
 * @author arrisdev
 * @date 09.05.2021
 * @time 14:27
 */
public interface ITransactionService
{
    JsonElement saveTransaction(JsonElement transaction);

    void deleteTransaction(Long transactionId);

    List<JsonElement> getAllTransactionsOfUser(Long userId);
}
