package com.sylfo.distrib

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel(val repo: FakeRepository) : ViewModel() {

    val count: LiveData<Int>
        get() = repo.counter

    fun onClick() {
        repo.increment()
    }
}