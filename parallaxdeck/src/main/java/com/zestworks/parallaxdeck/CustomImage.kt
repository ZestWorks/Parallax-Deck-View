package com.zestworks.parallaxdeck

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.ImageView

/**
 * Created by santhosh-3366 on 17/01/18.
 */
class CustomImage(context: Context,attributeSet: AttributeSet?=null) : ImageView(context,attributeSet){

    var offset : Float = 0f

    override fun onDraw(canvas: Canvas) {
        canvas.save()
        canvas.translate(offset,0f)
        super.onDraw(canvas)
        canvas.restore()
    }
}