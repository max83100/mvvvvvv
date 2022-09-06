package com.example.mvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val getData = GetData()
    private var liveDatastring = MutableLiveData<String>()
    val myLiveData = MyLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLiveData.observe(this, Observer {
            test_text.text = it
        })

        button.setOnClickListener{
            myLiveData.setValueTo(editText.text.toString())
        }


    }


}


