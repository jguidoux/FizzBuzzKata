package fr.slickteam.codingdojo.fizzbuzz.infra

import fr.slickteam.codingdojo.fizzbuzz.domain.IFizzBuzzSequence
import spock.lang.Specification

class ConsoleFizzBuzzAdapterSpec extends Specification {

    def "adapter should print '1 2 Fizz' whan I ask numbers from 1 to 3"() {

        given: "I have a mock hexagone"
        IFizzBuzzSequence hexagone = Mock()
        and: "the exagone return '[1,2,Fizz] when asking to transform numbers from '1' to '3'"
        hexagone.transfrom(1, 3) >> ["1", "2", "Fizz"]
        and: "I have a mock for the println"
        IWriteLine publicationStrategy = Mock()
        and: "I have my console adapter using these mocks"
        def adapter = new ConsoleFizzBuzzAdapter(hexagone, publicationStrategy)

        when: "I ask to print numbers from '1' to '3'"
        adapter.printFrom1ToOneHundredFizzBuzzNumbers(1, 3)

        then: "Then I should print '1' '2' and 'Fizz'"
        with(publicationStrategy) {
            1 * writeLine("1")
            1 * writeLine("2")
            1 * writeLine("Fizz")
            0 * writeLine(_)
        }

    }
}