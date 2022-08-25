package com.geektech.homework3_5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.isGone
import com.geektech.homework3_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0
    private var check: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BtnPlus.setOnClickListener() {
            if (count == 10 || binding.BtnPlus.text.equals("-1")){
                binding.BtnPlus.text = "-1"
                count--
                binding.TextResult.text = count.toString()
                if (count == 0){
                    binding.BtnPlus.text = "+1"
                    val intent = Intent(this,ResultActivity::class.java)
                    startActivity(intent)
                }
            }else{
                count++
                binding.TextResult.text = count.toString()
            }

       }
    }
}















