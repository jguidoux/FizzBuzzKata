package fr.slickteam.codingdojo.fizzbuzz.domain

class FizzBuzzSequence : IFizzBuzzSequence {


    override fun transfrom(from: Int, to: Int) = (from..to)
            .map { i -> FizzBuzzNumber(i) }
            .map { fizzBuzz -> fizzBuzz.getValue() }


}
