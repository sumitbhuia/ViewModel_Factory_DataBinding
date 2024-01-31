package com.example.viewmodelfactorydatabinding

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelfactorydatabinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    //Creating instances
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ActivityMainViewModel
    lateinit var factory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //For binding enable dataBinding = true in buildFeatures -> gradle(module)
        //Fpr viewModel import dependencies in gradle(module)

        //Binding setup
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //ViewModelFactory setup
        factory = ViewModelFactory(100)

        //ViewModel setup
        viewModel = ViewModelProvider(this,factory)[ActivityMainViewModel::class.java]


        // no need of findViewById
        binding.apply {
            button.setOnClickListener(){
                textView.text = viewModel.getUpdatedCount().toString()
            }
        }




    }
}