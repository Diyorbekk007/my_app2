package com.example.famousperson11.presenter

import com.example.famousperson11.screen.MainScreen
import com.example.famousperson11.data.model.FamousPersonData
import com.example.famousperson11.data.repository.FamousRepository

class MainPresenter(
    private val view: MainScreen,
    private val repository: FamousRepository
) {
    private val ls: List<FamousPersonData> = repository.getFamous()

    init {
        loadUi()
    }

    private fun loadUi() {
        view.setFirstItemDetail(ls[0])
        view.setSecondItemDetail(ls[1])
        view.setThirdItemDetail(ls[2])
        view.setFourthItemDetail(ls[3])
    }


    fun clickFirstItem() {
        view.openDetailScreen(ls[0])
    }

    fun clickSecondItem() {
        view.openDetailScreen(ls[1])
    }

    fun clickThirdItem() {
        view.openDetailScreen(ls[2])
    }

    fun clickFourthItem() {
        view.openDetailScreen(ls[3])
    }
}