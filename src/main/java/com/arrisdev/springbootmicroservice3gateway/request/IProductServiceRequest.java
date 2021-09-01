package com.arrisdev.springbootmicroservice3gateway.request;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * @author arrisdev
 * @date 09.05.2021
 * @time 14:02
 */
public interface IProductServiceRequest
{
    @POST("/api/product")
    Call<JsonElement> saveProduct(@Body JsonElement requestBody);

    @DELETE("/api/product/{productId}")
    Call<Void> deleteProduct(@Path("productId") Long productId);

    @GET("/api/product")
    Call<List<JsonElement>> getAllProducts();
}
