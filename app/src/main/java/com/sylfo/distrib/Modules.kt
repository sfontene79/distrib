package com.sylfo.distrib

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appmodule = module {
    viewModel { MainViewModel(get()) }
    single { FakeRepository() }
}