package com.example.famousperson11.presenter

import com.example.famousperson11.screen.TestFragment
import com.example.famousperson11.data.model.QuestionData
import com.example.famousperson11.data.repository.QuestionRepository

class TestPresenter(private val view: TestFragment, private val repository: QuestionRepository) {
    private var currentLs = ArrayList<QuestionData>()
    private var currentIndex = 0
    private var answerLs = ArrayList<Boolean>()

    fun back() {
        view.back()
    }

    fun loadUi(famousId: Int) {
        val ls = repository.getList(famousId)
        currentLs.addAll(ls)
        currentIndex = 0
        repeat(ls.size + 1) {
            answerLs.add(false)
        }
        view.setQuestionInformation(currentLs[currentIndex])
        view.changePrevVisibility(false)
        if (currentIndex == currentLs.size - 1) {
            view.changeNextIcon(true)
        }
    }

    fun next(index: Int) {
        if (currentIndex > currentLs.size - 1) {
            openCorrect()
            return
        }
        val answer = when (index) {
            0 -> currentLs[currentIndex].variantA
            1 -> currentLs[currentIndex].variantB
            2 -> currentLs[currentIndex].variantC
            else -> currentLs[currentIndex].variantD
        }
        if (answer == currentLs[currentIndex].correctAnswer) {
            answerLs[currentIndex] = true
        }
        currentIndex++
        if (currentIndex < currentLs.size) {
            view.setQuestionInformation(currentLs[currentIndex])
            view.changePrevVisibility(false)
            if (currentIndex == currentLs.size - 1) {
                view.changeNextIcon(true)
            }
        } else {
            openCorrect()
        }
    }

    private fun openCorrect() {
        val correctCount = answerLs.filter {
            it
        }.size
        view.openResult(correctCount)
    }

    fun previous() {
        view.changeNextIcon(false)
        answerLs[currentIndex] = false
        if (currentIndex > 0) {
            currentIndex--
            view.setQuestionInformation(currentLs[currentIndex])
            if (currentIndex == 0) {
                view.changePrevVisibility(true)
            }
        }
    }
}