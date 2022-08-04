package com.example.alert_dialog_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import com.example.alert_dialog_examples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val addContact = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add new person to  your contact list?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this,"You added new person to your contact list",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this,"You didn't add new person to your contact list",Toast.LENGTH_SHORT).show()
            }.create()
        binding.btnOne.setOnClickListener {
            addContact.show()
        }

        val options = arrayOf("First item", "Second item", "Third item")
        val singleChoice = AlertDialog.Builder(this)
            .setTitle("Choose on of these options")
            .setSingleChoiceItems(options,0) { _, i ->
                Toast.makeText(this,"You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this,"You accepted the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this,"You declined the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()

        binding.btnTwo.setOnClickListener {
            singleChoice.show()
        }

        val multiChoice = AlertDialog.Builder(this)
            .setTitle("Choose on of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)) { _, i, isChecked ->
                if(isChecked) {
                    Toast.makeText(this, "You checked ${options[i]}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this,"You unchecked ${options[i]}",Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this,"You accepted the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this,"You declined the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()
        binding.btnThree.setOnClickListener {
            multiChoice.show()
        }
    }

}