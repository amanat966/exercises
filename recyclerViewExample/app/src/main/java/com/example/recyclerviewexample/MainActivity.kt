package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            Todo("Follow AndroidDevs", false),
            Todo("Follow 1", false),
            Todo("Follow 2", false),
            Todo("Follow 3", false),
            Todo("Follow 4", false),
            Todo("Follow 5", false),
            Todo("Follow 6", false),
            Todo("Follow 7", false),
            Todo("Follow 8", false),
            Todo("Follow 9", false),
            Todo("Follow 10", false),
            Todo("Follow 11", false),
            Todo("Follow 12", false),
            Todo("Follow 13", false),
        )

        val adapter = TodoAdapter(todoList)
        binding.rvTodo.adapter = adapter
        binding.rvTodo.layoutManager = LinearLayoutManager(this)

        binding.btnTodo.setOnClickListener {
            val title = binding.edTodo.text.toString()
            val todo = Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
        }
    }
}