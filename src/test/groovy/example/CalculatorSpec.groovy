package example

import spock.lang.Ignore
import spock.lang.Specification

class CalculatorSpec extends Specification {
  def calc = new Calculator()

  def "addition works"() {
    expect:
    calc.add(2, 3) == 5
  }

  def "subtraction works"() {
    expect:
    calc.subtract(3, 2) == 1
  }

  def "multiplication works"() {
    expect:
    calc.multiply(2, 3) == 6
  }

  def "division works"() {
    expect:
    calc.divide(6, 3) == 2
  }

  def "division by zero throws exception"() {
    when:
    calc.divide(1, 0)

    then:
    thrown(IllegalArgumentException)
  }

  @Ignore
  def "modulus works"() {
    expect:
    calc.modulus(6, 3) == 1
  }

  /*
  def "max works"() {
    expect:
    calc.max(2, 3) == 3
  }

  def "min works"() {
    expect:
    calc.min(2, 3) == 2
  }

  def "is even works"() {
    expect:
    calc.isEven(2) == true
    calc.isEven(3) == false
  }

  def "power works"() {
    expect:
    calc.power(?, ?) == ?
  }

  def "square root works"() {
    expect:
    calc.squareRoot(4) == 2
  }
  */

}