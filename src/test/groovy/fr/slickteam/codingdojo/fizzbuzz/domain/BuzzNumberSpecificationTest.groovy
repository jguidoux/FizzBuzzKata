package fr.slickteam.codingdojo.fizzbuzz.domain

import fr.slickteam.codingdojo.fizzbuzz.domain.specifications.BuzzNumberSpecification
import spock.lang.Specification
import spock.lang.Unroll

class BuzzNumberSpecificationSpec extends Specification {


    @Unroll
    def "#a should be a buzz number"() {

        given: "the number #a"
        def value = a
        def spec = new BuzzNumberSpecification()

        when: "I check the rule is a buzz number"
        def isBuzz = spec.isSatisfiedBy(value)

        then: "It should be true"
        isBuzz == b

        where:
        a || b
        5 || true
        10 || true
    }

}
