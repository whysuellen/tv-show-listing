package com.example.by.adapter

import android.view.View
import com.example.by.R
import com.example.by.databinding.TvshowitemLayoutBinding
import com.example.by.domain.models.TvShow
import com.xwray.groupie.viewbinding.BindableItem

class TvShowAdaper2(
    private val tvShow: TvShow,
    private val action: () -> Unit
) :
    BindableItem<TvshowitemLayoutBinding>() {
    override fun bind(viewBinding: TvshowitemLayoutBinding, position: Int) {
        viewBinding.textTvShowTitle.text = tvShow.title

        viewBinding.root.setOnClickListener {
            action()
        }
    }

    override fun getLayout() = R.layout.tvshowitem_layout

    override fun initializeViewBinding(view: View): TvshowitemLayoutBinding =
        TvshowitemLayoutBinding.bind(view)

}