package com.example.myshoppingapplication.data.api

import com.example.myshoppingapplication.data.model.dogfact.DogFactModel
import com.example.myshoppingapplication.data.model.shoppingitems.Products
import com.example.myshoppingapplication.data.model.shoppingitems.ProductsItemModel
import retrofit2.http.GET

interface ApiEndpoints{
    @GET(ApiDetail.DOG_FACT_ENDPOINT)
    suspend fun getDogFact():DogFactModel
    @GET(ApiDetail.SHOP_ITEMS_ENDPOINT)
    suspend fun getProductItems():Products
}