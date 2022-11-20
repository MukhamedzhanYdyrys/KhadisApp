package com.example.khadisapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.khadisapp.model.allHadeest.allHadeest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainFragmentViewModel: ViewModel() {
    val list = MutableLiveData<allHadeest>()

    fun getAllHadeest(){
        viewModelScope.launch(Dispatchers.IO) {
            try {
                list.postValue(Retrofit.serviceApi.getAllHadeest())
            }catch (e : Exception){
                Log.d("ERROR ALL HADEEST", e.toString())
            }
        }
    }
}