package fr.slickteam.codingdojo.fizzbuzz.domain.specifications



interface ISpecification {

    fun isSatisfiedBy(value: Int): Boolean
    fun and(specification: ISpecification): ISpecification
    fun or(specification: ISpecification): ISpecification

}

abstract class AbstractCompositeSpecification : ISpecification {

    override fun and(specification: ISpecification): ISpecification {
        return AndSpecification(this, specification)
    }

    override fun or(specification: ISpecification): ISpecification {
        return OrSpecification(this, specification)
    }
}

class AndSpecification(private val leftCondition: ISpecification, private val rightCondition: ISpecification) : AbstractCompositeSpecification() {

    override fun isSatisfiedBy(value: Int) = leftCondition.isSatisfiedBy(value) && rightCondition.isSatisfiedBy(value)

}

class OrSpecification(private val leftCondition: ISpecification, private val rightCondition: ISpecification) : AbstractCompositeSpecification() {

    override fun isSatisfiedBy(value: Int) = leftCondition.isSatisfiedBy(value) || rightCondition.isSatisfiedBy(value)

}


abstract class LeafSpecification : AbstractCompositeSpecification() {

}




