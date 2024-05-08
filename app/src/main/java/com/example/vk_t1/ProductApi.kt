package com.example.vk_t1

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ProductApi {
    @GET("products")
    fun getProducts(@Query("limit") limit: Int, @Query("skip") skip: Int): Call<ProductsResponse>
}