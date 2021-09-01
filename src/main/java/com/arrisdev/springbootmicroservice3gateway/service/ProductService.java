package com.arrisdev.springbootmicroservice3gateway.service;

import com.arrisdev.springbootmicroservice3gateway.request.IProductServiceRequest;
import com.google.gson.JsonElement;
import com.arrisdev.springbootmicroservice3gateway.util.RetrofitUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author arrisdev
 * @date 09.06.2021
 * @time 14:08
 */
@Slf4j
@Service
public class ProductService implements IProductService
{
    @Autowired
    private IProductServiceRequest productServiceRequest;

    @Override
    public JsonElement saveProduct(JsonElement requestBody)
    {
        return RetrofitUtils.executeInBlock(productServiceRequest.saveProduct(requestBody));
    }

    @Override
    public void deleteProduct(Long productId)
    {
        RetrofitUtils.executeInBlock(productServiceRequest.deleteProduct(productId));
    }

    @Override
    public List<JsonElement> getAllProducts()
    {
        return RetrofitUtils.executeInBlock(productServiceRequest.getAllProducts());
    }
}
