package com.example.denisretrofitexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.denisretrofitexample.network.ApiClient
import com.example.denisretrofitexample.network.CharacterResponse
import retrofit2.Callback

class MainViewModel(private val repository: Repository
                    = Repository(ApiClient.apiService)) : ViewModel() {

    private var _charactersLiveData = MutableLiveData<List<Character>>()
    val characterLiveData: LiveData<List<Character>>
        get() = _charactersLiveData

    private fun fetchCharacter() {

        val client = repository.getCharacters("1")
        client.enqueue(object : Callback<CharacterResponse>) {

        }
    }
}