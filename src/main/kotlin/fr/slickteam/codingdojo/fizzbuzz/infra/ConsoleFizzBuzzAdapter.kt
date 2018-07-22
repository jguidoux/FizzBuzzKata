package fr.slickteam.codingdojo.fizzbuzz.infra

import fr.slickteam.codingdojo.fizzbuzz.domain.FizzBuzzSequence
import fr.slickteam.codingdojo.fizzbuzz.domain.Hexagone
import fr.slickteam.codingdojo.fizzbuzz.domain.IFizzBuzzSequence


class ConsoleFizzBuzzAdapter(private val hexagone: IFizzBuzzSequence,
                             private val publicationStrategy: IWriteLine = ConsoleWriteLine()) {


    fun printFrom1ToOneHundredFizzBuzzNumbers(from: Int, to: Int) {

        hexagone.transfrom(from, to)
                .forEach { i -> publicationStrategy.writeLine(i) }
    }
}


class ConsoleWriteLine : IWriteLine {

    override fun writeLine(fizzBuzzNumber: String) =
            println(fizzBuzzNumber)

}




fun main(args: Array<String>) {
    val hexagone = Hexagone(FizzBuzzSequence())
    val printer = ConsoleFizzBuzzAdapter(hexagone)
    printer.printFrom1ToOneHundredFizzBuzzNumbers(1,100)
}