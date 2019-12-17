package com.mahesaiqbal.news_feature.newsloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.mahesaiqbal.news_feature.R
import com.mahesaiqbal.news_feature.newsloader.adapter.NewsAdapter
import com.mahesaiqbal.news_feature.newsloader.datasource.DataRepository
import kotlinx.android.synthetic.main.activity_news_loader.*

class NewsLoaderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_loader)

        setupUI()
        getData()
    }

    private fun setupUI() {
        supportActionBar?.title = "News Loader"
    }

    private fun getData() {
        rv_news.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = NewsAdapter(DataRepository.getNews())
        }
    }
}
