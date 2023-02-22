package com.example.by

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.by.adapter.TvShowAdapter
import com.example.by.databinding.TvshowlistingactivityLayoutBinding
import com.example.by.domain.models.TvShow

class TVShowListingActivity : AppCompatActivity() {

    private lateinit var binding: TvshowlistingactivityLayoutBinding
    private lateinit var tvShowAdapter: TvShowAdapter
    private val tvShowList: MutableList<TvShow> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TvshowlistingactivityLayoutBinding.inflate(this.layoutInflater)
        setContentView(binding.root)

        val tvShowRecyclerView = binding.tvShowRecyclerView
        tvShowRecyclerView.layoutManager = LinearLayoutManager(this)
        tvShowRecyclerView.setHasFixedSize(true)
        tvShowAdapter = TvShowAdapter(this, tvShowList)
        tvShowRecyclerView.adapter = tvShowAdapter

        details()
    }

    private fun details() {
        val thePunisherTvShow = TvShow(
            title = resources.getString(R.string.thePunisher),
            image = R.drawable.the_punisher,
            age = resources.getString(R.string.thePunisherAge),
            description = resources.getString(R.string.thePunisherDescription)
        )
        tvShowList.add(thePunisherTvShow)

        val friendsTvShow = TvShow(
            title = resources.getString(R.string.friends),
            image = R.drawable.friends,
            age = resources.getString(R.string.friendsAge),
            description = resources.getString(R.string.friendsDescription)
        )
        tvShowList.add(friendsTvShow)


        val sandmanTvShow = TvShow(
            title = resources.getString(R.string.sandman),
            image = R.drawable.sandman,
            age = resources.getString(R.string.sandmanAge),
            description = resources.getString(R.string.sandmanDescription)
        )
        tvShowList.add(sandmanTvShow)

        val bojackHorsemanTvShow = TvShow(
            title = resources.getString(R.string.bojackHorseman),
            image = R.drawable.bojack,
            age = resources.getString(R.string.bojackHorsemanAge),
            description = resources.getString(R.string.bojackHorsemanDescription)
        )
        tvShowList.add(bojackHorsemanTvShow)

        val hellsingTvShow = TvShow(
            title = resources.getString(R.string.hellsing),
            image = R.drawable.hellsing,
            age = resources.getString(R.string.hellsingAge),
            description = resources.getString(R.string.hellsingDescription)
        )
        tvShowList.add(hellsingTvShow)

    }
}

//    private fun setupView() {
//        binding.buttonThePunisher.setOnClickListener {
//            val thePunisherTvShow = TvShow(
//                title = resources.getString(R.string.thePunisher),
//                image = R.drawable.the_punisher,
//                age = resources.getString(R.string.thePunisherAge),
//                description = resources.getString(R.string.thePunisherDescription)
//            )
//            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
//                putExtra(tvShowDetailsKey, thePunisherTvShow)
//            }
//            startActivity(intent)
//        }
//        binding.buttonFriends.setOnClickListener {
//            val friendsTvShow = TvShow(
//                title = resources.getString(R.string.friends),
//                image = R.drawable.friends,
//                age = resources.getString(R.string.friendsAge),
//                description = resources.getString(R.string.friendsDescription)
//            )
//            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
//                putExtra(tvShowDetailsKey, friendsTvShow)
//            }
//            startActivity(intent)
//        }
//        binding.buttonSandman.setOnClickListener {
//            val sandmanTvShow = TvShow(
//                title = resources.getString(R.string.sandman),
//                image = R.drawable.sandman,
//                age = resources.getString(R.string.sandmanAge),
//                description = resources.getString(R.string.sandmanDescription)
//            )
//            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
//                putExtra(tvShowDetailsKey, sandmanTvShow)
//            }
//            startActivity(intent)
//        }
//        binding.buttonBojackHorseman.setOnClickListener {
//            val bojackHorsemanTvShow = TvShow(
//                title = resources.getString(R.string.bojackHorseman),
//                image = R.drawable.bojack,
//                age = resources.getString(R.string.bojackHorsemanAge),
//                description = resources.getString(R.string.bojackHorsemanDescription)
//            )
//            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
//                putExtra(tvShowDetailsKey, bojackHorsemanTvShow)
//            }
//            startActivity(intent)
//        }
//        binding.buttonHellsing.setOnClickListener {
//            val hellsingTvShow = TvShow(
//                title = resources.getString(R.string.hellsing),
//                image = R.drawable.hellsing,
//                age = resources.getString(R.string.hellsingAge),
//                description = resources.getString(R.string.hellsingDescription)
//            )
//            val intent = Intent(this, TvShowDetailsActivity::class.java).apply {
//                putExtra(tvShowDetailsKey, hellsingTvShow)
//            }
//            startActivity(intent)
//        }
//    }
