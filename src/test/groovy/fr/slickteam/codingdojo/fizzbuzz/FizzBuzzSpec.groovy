package fr.slickteam.codingdojo.fizzbuzz

import fr.slickteam.codingdojo.fizzbuzz.domain.FizzBuzzAlgo
import spock.lang.Specification
import spock.lang.Unroll


class FizzBuzzSpec extends Specification {


    @Unroll
    def "#a should return #b"() {
        given: "the number '#a"
        def FizzBuzz = new FizzBuzzAlgo()

        when: "I launch the FizzBuzz algo"
        def result = FizzBuzz.transform(a)

        then: "I should retrieve the number #b"
        result == b

        where:
        a   || b
        1   || "1"
        2   || "2"
        3   || "Fizz"
        4   || "4"
        5   || "Buzz"
        6   || "Fizz"
        7   || "7"
        9   || "Fizz"
        10  || "Buzz"
        12  || "Fizz"
        15  || "FizzBuzz"
        16  || "16"
        90  || "FizzBuzz"
        160 || "Buzz"
    }

}