package com.example.homework_3


import java.util.concurrent.TimeUnit

open class Animals(distance: Int = 1080, speed: Int) {

    fun timeSpeed(name: String, distance: Int = 1080, speed: Int) {
        var timeAnimal: Int = distance / speed
        var timeHour = timeAnimal / 3600.0
        var timeMinutes = TimeUnit.SECONDS.toMinutes(timeAnimal.toLong())
        var timeSeconds = timeAnimal - timeMinutes * 60
        println("$name пробежал за $timeHour часа")
        println("$name пробежал за $timeMinutes минуты  и $timeSeconds секунд")
        println("--------------------------------------------")
    }
}


