package fr.slickteam.codingdojo.fizzbuzz.domain

import spock.lang.Specification
import spock.lang.Unroll


class FizzBuzzSequenceSpec extends Specification {

    @Unroll
    def "FizzBuzz Sequence From #b To #b"() {

        given: "a Fizz buzz Sequence"
        def sequence = new FizzBuzzSequence()

        when: "I ask for e sequence from #a to #b"
        def res = sequence.transfrom(a, b)

        then: "I should retrieve #c"
        res == c

        where:
        a | b  || c
        1 | 1  || ["1"]
        2 | 2  || ["2"]
        3 | 3  || ["Fizz"]
        1 | 3  || ["1", "2", "Fizz"]
        5 | 10 || ["Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
        5 | 3  || []
    }
}