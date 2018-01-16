package com.zestworks.parallaxdeck

import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.util.Log
import java.util.jar.Attributes

/**
 * Created by santhosh-3366 on 17/01/18.
 */
class ParallaxPager(context: Context, attributes: AttributeSet? = null) : ViewPager(context, attributes){

    init {
        clipChildren = false
        clipToPadding = false
        setPadding(120, 0, 120, 0)

    }

    override fun setAdapter(adapter: PagerAdapter?) {
        super.setAdapter(adapter)
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Log.e("position ","offset "+positionOffset+"  "+positionOffsetPixels+"  "+position)
        super.onPageScrolled(position, positionOffset, positionOffsetPixels)
        val customImage = getChildAt(position)?.findViewById<CustomImage>(R.id.custom_image)
        customImage!!.offset -= 20f
        customImage?.invalidate()
    }

}