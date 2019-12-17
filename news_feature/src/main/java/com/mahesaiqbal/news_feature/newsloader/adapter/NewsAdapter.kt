package com.mahesaiqbal.news_feature.newsloader.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.mahesaiqbal.news_feature.R
import com.mahesaiqbal.news_feature.newsloader.model.News
import com.mahesaiqbal.news_feature.newsloader.adapter.NewsAdapter.NewsViewHolder
import kotlinx.android.synthetic.main.news_item.view.*

class NewsAdapter(val items: List<News>) : Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder =
        NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false))

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class NewsViewHolder(itemView: View) : ViewHolder(itemView) {

        fun bindItem(news: News) {
            itemView.tv_title.text = news.title
            itemView.tv_desc.text = news.description
        }
    }
}
