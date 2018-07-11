package fr.slickteam.codingdojo.fizzbuzz.domain

import fr.slickteam.codingdojo.fizzbuzz.domain.FizzBuzzValue.*


class FizzBuzzAlgo : IFizzBuzz {

    override fun transform(value: Int): String {
        if (isDivisibleByTree(value) && isDivisibleByFive(value)) {
            return  FIZZ_BUZZ.value
        }
        if (isDivisibleByTree(value)) {
            return FIZZ.value
        }
        if (isDivisibleByFive(value)) {
            return BUZZ.value
        }
        return value.toString()
    }


    private fun isDivisibleByTree(nuwber: Int) = nuwber % 3 == 0

    private fun isDivisibleByFive(nuwber: Int) = nuwber  % 5 == 0

}


enum class FizzBuzzValue(val value: String){
    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZ_BUZZ("FizzBuzz")
}