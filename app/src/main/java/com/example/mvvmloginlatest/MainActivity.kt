package com.example.mvvmloginlatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmloginlatest.Mainmodel
import androidx.databinding.DataBindingUtil
import com.example.mvvmloginlatest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(binding.root)
        binding.mainmodel=Mainmodel("Roshan","12345678")
    }
}