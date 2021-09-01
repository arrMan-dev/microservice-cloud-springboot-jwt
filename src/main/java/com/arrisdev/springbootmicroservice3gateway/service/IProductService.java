package com.arrisdev.springbootmicroservice3gateway.service;

import com.google.gson.JsonElement;

import java.util.List;

/**
 * @author arrisdev
 * @date 09.05.2021
 * @time 14:08
 */
public interface IProductService
{
    JsonElement saveProduct(JsonElement requestBody);

    void deleteProduct(Long productId);

    List<JsonElement> getAllProducts();
}
