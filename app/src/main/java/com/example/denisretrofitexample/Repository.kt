package com.example.denisretrofitexample

import com.example.denisretrofitexample.network.ApiService

class Repository(private val apiService: ApiService) {

    fun getCharacters(page: String) = apiService.fetchCharacters(page)
}