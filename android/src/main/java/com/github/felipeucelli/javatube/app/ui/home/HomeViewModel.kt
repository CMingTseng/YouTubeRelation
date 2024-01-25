package com.github.felipeucelli.javatube.app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.felipeucelli.javatube.Playlist

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        object : Thread() {
            override fun run() {
                val linkToTest="https://www.youtube.com/playlist?list=PLMC9KNkIncKtPzgY-5rmhvj7fax8fdxoj, Pop Music Playlist - Timeless Pop Songs (Updated Weekly 2024)"
                postValue(Playlist(linkToTest).title)

            }
        }.start()

    }
    val text: LiveData<String> = _text
}