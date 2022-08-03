package com.example.fragment_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment, firstFragment)
            commit()
        }

        binding.btnFrist.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        binding.btnSecond.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }



}