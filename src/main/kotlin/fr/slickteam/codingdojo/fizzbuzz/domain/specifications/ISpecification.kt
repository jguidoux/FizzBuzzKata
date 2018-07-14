package fr.slickteam.codingdojo.fizzbuzz.domain.specifications



interface ISpecification<T> {

    fun isSatisfiedBy(container: T): Boolean
    fun and(specification: ISpecification<T>): ISpecification<T>
    fun or(specification: ISpecification<T>): ISpecification<T>

}

abstract class AbstractCompositeSpecification<T> : ISpecification<T> {

    override fun and(specification: ISpecification<T>): ISpecification<T> {
        return AndSpecification(this, specification)
    }

    override fun or(specification: ISpecification<T>): ISpecification<T> {
        return OrSpecification(this, specification)
    }
}

class AndSpecification<T>(private val leftCondition: ISpecification<T>, private val rightCondition: ISpecification<T>) : AbstractCompositeSpecification<T>() {

    override fun isSatisfiedBy(container: T) = leftCondition.isSatisfiedBy(container) && rightCondition.isSatisfiedBy(container)

}

class OrSpecification<T>(private val leftCondition: ISpecification<T>, private val rightCondition: ISpecification<T>) : AbstractCompositeSpecification<T>() {

    override fun isSatisfiedBy(container: T) = leftCondition.isSatisfiedBy(container) || rightCondition.isSatisfiedBy(container)

}


abstract class LeafSpecification<T> : AbstractCompositeSpecification<T>() {

}




