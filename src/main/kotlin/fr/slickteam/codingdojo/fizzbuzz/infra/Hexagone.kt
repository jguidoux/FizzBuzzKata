package fr.slickteam.codingdojo.fizzbuzz.infra

import fr.slickteam.codingdojo.fizzbuzz.domain.IFizzBuzzSequence

class Hexagone(private val fizzBuzz: IFizzBuzzSequence) : IFizzBuzzSequence {


    override fun transfrom(from: Int, to: Int) = fizzBuzz.transfrom(from, to)


}