package fr.slickteam.codingdojo.fizzbuzz.domain.specifications



class FizzBuzzNumberSpecification : LeafSpecification<Int>() {

    private val fizzNumberSpec = FizzNumberSpecification()
    private val buzzNumberSpec = BuzzNumberSpecification()

    override fun isSatisfiedBy(container: Int) = fizzNumberSpec.and(buzzNumberSpec).isSatisfiedBy(container)

}


class FizzNumberSpecification : LeafSpecification<Int>() {


    private val isDivisibleBy3Spec = IsDivisibleByNSpecification(3)
    private val has3InItSpec = hasNInItSpecification(3)

    override fun isSatisfiedBy(container: Int) = isDivisibleBy3Spec.or(has3InItSpec).isSatisfiedBy(container)

}

class BuzzNumberSpecification : LeafSpecification<Int>() {


    private val isDivisibleBy5Spec = IsDivisibleByNSpecification(5)
    private val has5InItSpec = hasNInItSpecification(5)

    override fun isSatisfiedBy(container: Int) = isDivisibleBy5Spec.or(has5InItSpec).isSatisfiedBy(container)

}


class IsDivisibleByNSpecification(private val number: Int) : LeafSpecification<Int>() {

    override fun isSatisfiedBy(container: Int) = container % number == 0
}

class hasNInItSpecification(private val number: Int) : LeafSpecification<Int>() {

    override fun isSatisfiedBy(container: Int) = container.toString().contains(number.toString())
}

