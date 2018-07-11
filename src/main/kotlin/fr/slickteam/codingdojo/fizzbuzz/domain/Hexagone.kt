package fr.slickteam.codingdojo.fizzbuzz.domain

class Hexagone(private val fizzBuzz: IFizzBuzz) : IFizzBuzz {


    override fun transform(value: Int) = fizzBuzz.transform(value)


}