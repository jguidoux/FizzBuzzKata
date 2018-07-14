package fr.slickteam.codingdojo.fizzbuzz.domain

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzNumberSpec extends Specification {


    @Unroll
    def "#a should return #b"() {
        given: "the number '#a"
        def fizzBuzz = new FizzBuzzNumber(a)

        when: "I launch the FizzBuzz algo"
        def result = fizzBuzz.getValue()

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
        13  || "Fizz"
        15  || "FizzBuzz"
        16  || "16"
        23  || "Fizz"
        31  || "Fizz"
        32  || "Fizz"
        33  || "Fizz"
        35  || "FizzBuzz"
        50  || "Buzz"
        51  || "FizzBuzz"
        53  || "FizzBuzz"
        90  || "FizzBuzz"
        160 || "Buzz"
    }

}