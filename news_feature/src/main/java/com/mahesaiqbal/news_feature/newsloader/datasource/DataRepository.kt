package com.mahesaiqbal.news_feature.newsloader.datasource

import com.mahesaiqbal.news_feature.newsloader.model.News

object DataRepository {

    fun getNews(): List<News> {
        val output = ArrayList<News>()

        (1..5).forEach { index ->
            output.add(News(index, "News Title $index", "News Description $index", index * 2))
        }

        return output
    }
}