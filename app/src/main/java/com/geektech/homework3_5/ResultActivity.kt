
package com.geektech.homework3_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.homework3_5.databinding.ActivityMainBinding
import com.geektech.homework3_5.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}