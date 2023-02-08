package com.example.by

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.by.databinding.TvshowlistingactivityLayoutBinding
import com.example.by.domain.models.TvShow
import com.example.by.tvShows.TvShowDetailsActivity

class TVShowListingActivity : AppCompatActivity() {

    private lateinit var binding: TvshowlistingactivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TvshowlistingactivityLayoutBinding.inflate(this.layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.buttonThePunisher.setOnClickListener {
            val thePunisherTvShow = TvShow(
                title = resources.getString(R.string.thePunisher),
                image = R.drawable.the_punisher,
                age = resources.getString(R.string.thePunisherAge),
                description = resources.getString(R.string.thePunisherDescription)
            )
            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
                putExtra("chave_aleatoria", thePunisherTvShow)
            }
            startActivity(intent)
        }
        binding.buttonFriends.setOnClickListener {
            val friendsTvShow = TvShow(
                title = resources.getString(R.string.friends),
                image = R.drawable.friends,
                age = resources.getString(R.string.friendsAge),
                description = resources.getString(R.string.friendsDescription)
            )
            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
                putExtra("chave_aleatoria", friendsTvShow)
            }
            startActivity(intent)
        }
        binding.buttonSandman.setOnClickListener {
            val sandmanTvShow = TvShow(
                title = resources.getString(R.string.sandman),
                image = R.drawable.sandman,
                age = resources.getString(R.string.sandmanAge),
                description = resources.getString(R.string.sandmanDescription)
            )
            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
                putExtra("chave_aleatoria", sandmanTvShow)
            }
            startActivity(intent)
        }
        binding.buttonBojackHorseman.setOnClickListener {
            val bojackHorsemanTvShow = TvShow(
                title = resources.getString(R.string.bojackHorseman),
                image = R.drawable.bojack,
                age = resources.getString(R.string.bojackHorsemanAge),
                description = resources.getString(R.string.bojackHorsemanDescription)
            )
            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
                putExtra("chave_aleatoria", bojackHorsemanTvShow)
            }
            startActivity(intent)
        }
        binding.buttonHellsing.setOnClickListener {
            val hellsingTvShow = TvShow(
                title = resources.getString(R.string.hellsing),
                image = R.drawable.hellsing,
                age = resources.getString(R.string.hellsingAge),
                description = resources.getString(R.string.hellsingDescription)
            )
            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
                putExtra("chave_aleatoria", hellsingTvShow)
            }
            startActivity(intent)
        }
    }
}