package com.sylfo.distrib

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    var nb = 0

    fun onClick() {
        nb++
        count.value = nb
    }
}