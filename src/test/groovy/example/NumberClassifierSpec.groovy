package example

import spock.lang.Specification

class NumberClassifierSpec extends Specification {
  def numberClassifier1 = new NumberClassifier1()
  def numberClassifier2 = new NumberClassifier2()

  def "coverage"() {
    expect:
    numberClassifier2.classifyNumber(0) == "Zero"
    numberClassifier2.classifyNumber(2) == "Positive Even"
    numberClassifier2.classifyNumber(-1) == "Negative Odd"
  }
}
