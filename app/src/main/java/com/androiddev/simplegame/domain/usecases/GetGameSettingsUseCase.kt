package com.androiddev.simplegame.domain.usecases

import com.androiddev.simplegame.domain.entity.GameSettings
import com.androiddev.simplegame.domain.entity.Level
import com.androiddev.simplegame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}