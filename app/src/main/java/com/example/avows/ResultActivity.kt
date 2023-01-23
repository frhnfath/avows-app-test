package com.example.avows

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.avows.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = intent.getStringExtra(EXTRA_IMAGE)
        binding.edtResult.setText(text)
    }

    companion object {
        const val EXTRA_IMAGE = "extra_image"
    }
}