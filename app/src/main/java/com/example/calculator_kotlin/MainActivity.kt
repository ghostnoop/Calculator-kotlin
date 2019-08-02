package com.example.calculator_kotlin

import android.annotation.SuppressLint
import android.net.sip.SipSession
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var viewModelMain: ViewModelMain


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory: ViewModelMain.Factory =  ViewModelMain.Factory(MainRepository.getInstance())
        viewModelMain = ViewModelProviders.of(this,factory).get(ViewModelMain::class.java)

        viewModelMain.click(this,framer)

    }






}
