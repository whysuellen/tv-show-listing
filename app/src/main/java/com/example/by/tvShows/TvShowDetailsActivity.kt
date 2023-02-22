package com.example.by.tvShows

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.by.Keys
import com.example.by.databinding.TvshowdetailsactivityLayoutBinding
import com.example.by.domain.models.TvShow

class TvShowDetailsActivity : AppCompatActivity() {

    private lateinit var binding: TvshowdetailsactivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TvshowdetailsactivityLayoutBinding.inflate(this.layoutInflater)
        setContentView(binding.root)

        val tvShow = intent.extras?.getSerializable(Keys.tvShowDetailsKey) as? TvShow

        if (tvShow != null) {
            binding.toolbar.title = tvShow.title
            binding.toolbar.setTitleTextColor(Color.WHITE)
            binding.tvshowdetailsactivityLayoutImage.setImageResource(tvShow.image)
            binding.tvshowdetailsactivityLayoutAge.text = tvShow.age
            binding.tvshowdetailsactivityLayoutDescription.text = tvShow.description

        }
    }


}
