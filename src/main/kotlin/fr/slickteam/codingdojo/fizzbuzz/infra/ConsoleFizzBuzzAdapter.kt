package fr.slickteam.codingdojo.fizzbuzz.infra

import fr.slickteam.codingdojo.fizzbuzz.domain.FizzBuzzAlgo
import fr.slickteam.codingdojo.fizzbuzz.domain.Hexagone


class ConsoleFizzBuzzAdapter(private val hexagone: Hexagone) {


    fun printFrom1ToOneHundredFizzBuzzNumbers() {
        (1..100).map { i -> hexagone.transform(i) }
                .forEach { i -> println(i) }

    }
}

fun main(args: Array<String>) {
    val hexagone = Hexagone(FizzBuzzAlgo())
    val printer = ConsoleFizzBuzzAdapter(hexagone)
    printer.printFrom1ToOneHundredFizzBuzzNumbers()
}