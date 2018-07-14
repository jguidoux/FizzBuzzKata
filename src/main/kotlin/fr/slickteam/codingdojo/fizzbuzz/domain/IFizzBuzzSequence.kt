package fr.slickteam.codingdojo.fizzbuzz.domain

interface IFizzBuzzSequence {
    fun transfrom(from: Int, to: Int): List<String>
}