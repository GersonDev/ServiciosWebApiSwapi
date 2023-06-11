package com.example.servicioswebapiswapi.presentation.screems.swapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicioswebapiswapi.R
import com.example.servicioswebapiswapi.databinding.ActivitySwapiBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SwapiActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySwapiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwapiBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}