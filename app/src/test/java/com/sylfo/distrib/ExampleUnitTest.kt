package com.sylfo.distrib

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.jraska.livedata.test
import mock
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @get:Rule
    val rule: TestRule = InstantTaskExecutorRule()

    lateinit var repo: FakeRepository
    lateinit var model: MainViewModel
    lateinit var data: MutableLiveData<Int>

    @Before
    fun before() {
        data = MutableLiveData<Int>().apply { value = 0 }
        repo = mock()
        `when`(repo.counter).thenReturn(data)

        model = MainViewModel(repo)
    }

    @Test
    fun shouldStartWithCounterZero() {
        val test = model.count.test()
        test.assertValue(0)
    }

    @Test
    fun shouldUpdateCounter() {
        val test = model.count.test()
        data.postValue(2)
        test.assertValue(2)
    }

    @Test
    fun shouldCallRepo() {
        model.onClick()
        verify(repo).increment()
    }
}
