package com.example.viewmodelfactorydatabinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

//setting up a viewModel Factory AKA (constructor/parameter/input) for viewModel
class ViewModelFactory(private val startingNum: Int):ViewModelProvider.Factory {

    //boiler plate code for ViewModelFactory
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        //This is custom
        if(modelClass.isAssignableFrom(ActivityMainViewModel::class.java)){
            return ActivityMainViewModel(startingNum) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}