package fr.slickteam.codingdojo.fizzbuzz.domain

import fr.slickteam.codingdojo.fizzbuzz.domain.FizzBuzzValue.*
import fr.slickteam.codingdojo.fizzbuzz.domain.specifications.BuzzNumberSpecification
import fr.slickteam.codingdojo.fizzbuzz.domain.specifications.FizzBuzzNumberSpecification
import fr.slickteam.codingdojo.fizzbuzz.domain.specifications.FizzNumberSpecification


class FizzBuzzNumber(private val numberToTransform: Int) {


    private val fizzNumberSpec = FizzNumberSpecification()
    private val buzzNumberSpec = BuzzNumberSpecification()
    private val fizzBuzzNumberSpec = FizzBuzzNumberSpecification()


    fun getValue(): String {

        val isFizzNumber = fizzNumberSpec.isSatisfiedBy(numberToTransform)
        val isBuzzNumber = buzzNumberSpec.isSatisfiedBy(numberToTransform)
        val isFizzBuzzNumber = fizzBuzzNumberSpec.isSatisfiedBy(numberToTransform)

        if (isFizzBuzzNumber) {
            return  FIZZ_BUZZ.value
        }
        if (isFizzNumber) {
            return FIZZ.value
        }
        if (isBuzzNumber) {
            return BUZZ.value
        }
        return numberToTransform.toString()
    }


}


enum class FizzBuzzValue(val value: String){
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("FizzBuzz")
}