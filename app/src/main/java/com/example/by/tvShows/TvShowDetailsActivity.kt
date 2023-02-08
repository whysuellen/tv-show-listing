package com.example.by.tvShows

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.by.databinding.TvshowdetailsactivityLayoutBinding
import com.example.by.domain.models.TvShow

class TvShowDetailsActivity : AppCompatActivity() {
    lateinit var binding: TvshowdetailsactivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = TvshowdetailsactivityLayoutBinding.inflate(this.layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val tvShow = intent.extras?.getSerializable("chave_aleatoria") as? TvShow

        if (tvShow != null) {
            binding.toolbar.title = tvShow.title
            binding.toolbar.setTitleTextColor(Color.WHITE)
            binding.imageView.setImageResource(tvShow.image)
            binding.ageView.text = tvShow.age
            binding.descriptionView.text = tvShow.description

        }
    }
}
