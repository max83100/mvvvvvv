package com.example.mvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class GetData :LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getData(){
        println("get")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun sendData(){
        println("send")
    }
}