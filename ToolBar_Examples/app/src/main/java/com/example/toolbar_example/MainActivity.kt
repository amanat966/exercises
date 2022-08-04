package com.example.toolbar_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.addContact -> Toast.makeText(this,"You clicked to Add Contact", Toast.LENGTH_SHORT).show()
            R.id.favorite -> Toast.makeText(this,"You clicked to Favorites", Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this,"You clicked to Settings", Toast.LENGTH_SHORT).show()
            R.id.feedback -> Toast.makeText(this,"You clicked to Give Feedback", Toast.LENGTH_SHORT).show()
            R.id.close -> finish()
        }
        return true
    }
}