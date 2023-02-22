package com.androiddev.simplegame.domain.entity

data class GameSettings (
    val maxSumValue:Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gametimeInseconds: Int
        )