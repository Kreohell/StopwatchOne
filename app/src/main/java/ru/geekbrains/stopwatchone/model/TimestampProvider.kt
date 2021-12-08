package ru.geekbrains.stopwatchone.model

interface TimestampProvider {
    fun getMilliseconds(): Long
}