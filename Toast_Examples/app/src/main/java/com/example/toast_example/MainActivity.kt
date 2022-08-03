package com.example.toast_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Toast
import com.example.toast_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val container = findViewById<ViewGroup>(R.id.clToast)
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, container)
                show()
            }
        }
    }
}