package com.lindroy.multistatelayout.util

import android.content.Context
import android.view.LayoutInflater
import android.view.View

/**
 * @author Lin
 * @date 2020/2/9
 * @function
 */
internal fun Context.inflateView(layoutId: Int): View =
    LayoutInflater.from(this).inflate(layoutId, null)




