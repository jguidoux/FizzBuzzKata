package fr.slickteam.codingdojo.fizzbuzz.infra

import fr.slickteam.codingdojo.fizzbuzz.domain.FizzBuzzSequence
import fr.slickteam.codingdojo.fizzbuzz.domain.Hexagone


class ConsoleFizzBuzzAdapter(private val hexagone: Hexagone) {


    fun printFrom1ToOneHundredFizzBuzzNumbers() {
        hexagone.transfrom(1, 100)
                .forEach { i -> println(i) }

    }
}

fun main(args: Array<String>) {
    val hexagone = Hexagone(FizzBuzzSequence())
    val printer = ConsoleFizzBuzzAdapter(hexagone)
    printer.printFrom1ToOneHundredFizzBuzzNumbers()
}