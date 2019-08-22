package com.sylfo.distrib

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeRepository {

    private val _counter = MutableLiveData<Int>().apply { value = 0 }

    val counter: LiveData<Int>
        get() = _counter

    fun increment() {
        _counter.value?.let {
           _counter.value = it + 1
        }
    }
}