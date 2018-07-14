package fr.slickteam.codingdojo.fizzbuzz.domain.specifications



class FizzBuzzNumberSpecification : LeafSpecification() {

    private val fizzNumberSpec = FizzNumberSpecification()
    private val buzzNumberSpec = BuzzNumberSpecification()

    override fun isSatisfiedBy(value: Int) = fizzNumberSpec.and(buzzNumberSpec).isSatisfiedBy(value)

}


class FizzNumberSpecification : LeafSpecification() {


    private val isDivisibleBy3Spec = IsDivisibleByNSpecification(3)
    private val has3InItSpec = hasNInItSpecification(3)

    override fun isSatisfiedBy(value: Int) = isDivisibleBy3Spec.or(has3InItSpec).isSatisfiedBy(value)

}

class BuzzNumberSpecification : LeafSpecification() {


    private val isDivisibleBy5Spec = IsDivisibleByNSpecification(5)
    private val has5InItSpec = hasNInItSpecification(5)

    override fun isSatisfiedBy(value: Int) = isDivisibleBy5Spec.or(has5InItSpec).isSatisfiedBy(value)

}


class IsDivisibleByNSpecification(private val number: Int) : LeafSpecification() {

    override fun isSatisfiedBy(value: Int) = value % number == 0
}

class hasNInItSpecification(private val number: Int) : LeafSpecification() {

    override fun isSatisfiedBy(value: Int) = value.toString().contains(number.toString())
}

