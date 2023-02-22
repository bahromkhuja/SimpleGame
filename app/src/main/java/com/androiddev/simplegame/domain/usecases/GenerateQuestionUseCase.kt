package com.androiddev.simplegame.domain.usecases

import com.androiddev.simplegame.domain.entity.Question
import com.androiddev.simplegame.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question{
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    companion object{
        private val COUNT_OF_OPTIONS = 6
    }
}