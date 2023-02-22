package com.example.by.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.by.databinding.TvshowitemLayoutBinding
import com.example.by.domain.models.TvShow
import com.example.by.tvShows.TvShowDetailsActivity
import com.example.by.Keys.tvShowDetailsKey


class TvShowAdapter (private val context : Context, private val tvShowList: MutableList<TvShow>):
    RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemList = TvshowitemLayoutBinding.inflate(LayoutInflater.from(context), parent, false)
        return TvShowViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        holder.tvShowTitle.text = tvShowList[position].title
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, TvShowDetailsActivity::class.java)

            intent.putExtra(tvShowDetailsKey, tvShowList[position])
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = tvShowList.size

    class TvShowViewHolder(binding: TvshowitemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        val tvShowTitle = binding.textTvShowTitle
    }
}