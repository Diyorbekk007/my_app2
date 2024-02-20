package com.example.famousperson11.presenter

import com.example.famousperson11.screen.DetailScreen
import com.example.famousperson11.data.repository.FamousRepository

class DetailPresenter(
    private val view: DetailScreen,
    private val repository: FamousRepository
) {
    private var famousId = -1
    fun back() {
        view.back()
    }


    fun loadUi(id: Int) {
        famousId = id
        val data = repository.getFamousById(id)
        if (data != null)
            view.setFamousInformation(data)
    }

    fun openTest() {
        view.openTest(famousId)
    }
}