package com.arrisdev.springbootmicroservice3gateway.controller;

import com.arrisdev.springbootmicroservice3gateway.service.IProductService;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author arrisdev
 * @date 09.04.2021
 * @time 14:17
 */
@RestController
@RequestMapping("gateway/product")
public class ProductController
{
    @Autowired
    private IProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody JsonElement product)
    {
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @DeleteMapping("{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId)
    {
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllProducts()
    {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
