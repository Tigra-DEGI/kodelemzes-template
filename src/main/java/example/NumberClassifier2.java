package example;

class NumberClassifier2 {
  String classifyNumber(int number) {
    if (number != 0) {
      var sign = (number > 0 ? "Positive " : "Negative ");
      var evenOrOdd = (number % 2 == 0 ? "Even" : "Odd");
      return sign + evenOrOdd;
    } else {
      return "Zero";
    }
  }
}