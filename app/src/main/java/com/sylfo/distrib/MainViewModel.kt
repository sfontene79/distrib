package com.sylfo.distrib

import android.content.Context
import androidx.databinding.ObservableField

class MainViewModel(val context: Context) {
    val text = ObservableField<String>(context.getString(R.string.text))
    var nb = 0

    fun onClick() {
        nb++
        text.set(context.getString(R.string.text) + " " + nb)
    }
}