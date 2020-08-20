package com.bennyhuo.kotlin.datetime.demo.common

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant


fun getTime(): Long {
    val currentMoment: Instant = Clock.System.now()
    return currentMoment.toEpochMilliseconds()
}