package com.example.viewmodelfactorydatabinding

import androidx.lifecycle.ViewModel

class ActivityMainViewModel(staringNum: Int):ViewModel() {

    //Placing all variables and function which need data persistence
    // And safety from configuration change
    private var counter =0
    init {
        counter = staringNum
    }
    fun getItemCount():Int{
       return counter
    }
    fun getUpdatedCount():Int{
        return ++counter
    }


}