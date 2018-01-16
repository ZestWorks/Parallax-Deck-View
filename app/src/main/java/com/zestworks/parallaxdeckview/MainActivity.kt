package com.zestworks.parallaxdeckview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.zestworks.parallaxdeck.POKO
import com.zestworks.parallaxdeck.PagerAdapter
import com.zestworks.parallaxdeck.ParallaxPager
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<POKO>()
        for (i in 0..9){
            list.add(POKO(UUID.randomUUID().toString()))
        }

        val pagerAdapter = PagerAdapter(list)

        findViewById<ViewPager>(R.id.pager).adapter = pagerAdapter
    }
}
