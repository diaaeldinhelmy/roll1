package com.example.roll

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.roll.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val x=binding.button
        x.setOnClickListener { rolldice() }


    }
    private  fun rolldice (){

        val y=binding.imageView
        val d=(1..6).random()
        if (d==1)
            Toast.makeText(this, "number 1", Toast.LENGTH_SHORT).show()
        else if(d==2)
            Toast.makeText(this, "number 2", Toast.LENGTH_SHORT).show()
        else if(d==3)
            Toast.makeText(this, "number 3", Toast.LENGTH_SHORT).show()
        else if (d==4)
            Toast.makeText(this, "number 4", Toast.LENGTH_SHORT).show()
        else if (d==5)
            Toast.makeText(this, "number 5", Toast.LENGTH_SHORT).show()
        else if (d==6)
            Toast.makeText(this, "number 6", Toast.LENGTH_SHORT).show()
        when (d) {

            1 -> y.setImageResource(R.drawable.dice_1)

            2 -> y.setImageResource(R.drawable.dice_2)
            3 -> y.setImageResource(R.drawable.dice_3)
            4 -> y.setImageResource(R.drawable.dice_4)
            5 -> y.setImageResource(R.drawable.dice_5)
            6 -> y.setImageResource(R.drawable.dice_6)

        }
    }

}