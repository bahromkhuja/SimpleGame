package com.androiddev.simplegame.domain.repository

import com.androiddev.simplegame.domain.entity.GameSettings
import com.androiddev.simplegame.domain.entity.Level
import com.androiddev.simplegame.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}