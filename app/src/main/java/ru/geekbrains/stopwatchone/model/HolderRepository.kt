package ru.geekbrains.stopwatchone.model

interface HolderRepository {
    fun getTimes() : String
    fun startHolder()
    fun stopHolder()
    fun pauseHolder()
}