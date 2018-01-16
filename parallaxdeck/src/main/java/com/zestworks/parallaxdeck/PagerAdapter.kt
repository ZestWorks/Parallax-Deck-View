package com.zestworks.parallaxdeck

import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

/**
 * Created by santhosh-3366 on 17/01/18.
 */
class PagerAdapter(private val pokoList: List<POKO>) : PagerAdapter() {

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val inflate = LayoutInflater.from(container?.context).inflate(R.layout.pager_holder, container, false)
        container?.addView(inflate)
        return inflate
    }

    override fun isViewFromObject(view: View?, `object`: Any?): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return pokoList.size
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }


}