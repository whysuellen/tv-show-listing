package com.example.by

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.by.databinding.Tvshowlistingactivity2LayoutBinding
import com.example.by.tvShows.ThePunisherActivity

class TVShowListing2Activity : AppCompatActivity (){

    private lateinit var binding: Tvshowlistingactivity2LayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Tvshowlistingactivity2LayoutBinding.inflate(this.layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.buttonThePunisher.setOnClickListener {
            val intent = Intent(this, ThePunisherActivity::class.java)
            startActivity(intent)
            }
        }
    }