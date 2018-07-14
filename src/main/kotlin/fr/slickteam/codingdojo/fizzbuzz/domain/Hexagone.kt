package fr.slickteam.codingdojo.fizzbuzz.domain

class Hexagone(private val fizzBuzz: IFizzBuzzSequence) : IFizzBuzzSequence {


    override fun transfrom(from: Int, to: Int) = fizzBuzz.transfrom(from, to)


}