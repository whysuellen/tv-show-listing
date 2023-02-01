package com.example.by

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.by.databinding.Tvshowlistingactivity2LayoutBinding
import com.example.by.domain.models.TvShow
import com.example.by.tvShows.TvShowDetailsActivity

class TVShowListing2Activity : AppCompatActivity() {

    private lateinit var binding: Tvshowlistingactivity2LayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Tvshowlistingactivity2LayoutBinding.inflate(this.layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.buttonThePunisher.setOnClickListener {
            val thePunisherTvShow = TvShow(
                title = "The Punisher",
                image = R.drawable.the_punisher,
                age = "2017",
                description = "Em O Justiceiro, o crime não dura quando Frank Castle está por perto. O veterano de guerra é impiedoso na sua guerra contra malfeitores, alimentada pelo ódio gerado quando sua família foi pega no fogo cruzado durante um tiroteio entre mafiosos."
            )
            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
                putExtra("chave_aleatoria", thePunisherTvShow)
            }
            startActivity(intent)
        }
    }
}