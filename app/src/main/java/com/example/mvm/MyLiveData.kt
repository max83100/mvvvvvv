package com.example.mvm

import androidx.lifecycle.LiveData

class MyLiveData : LiveData<String>() {

    fun setValueTo(string: String){
        value = string
    }
    override fun onActive() {
        super.onActive()
        println("onActive")
    }

    override fun onInactive() {
        super.onInactive()
        println("onInactive")
    }
}