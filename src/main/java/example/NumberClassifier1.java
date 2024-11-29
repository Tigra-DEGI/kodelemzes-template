package example;

class NumberClassifier1 {
  String classifyNumber(int number) {
    if (number > 0) {
      if (number % 2 == 0) {
        return "Positive Even";
      } else {
        return "Positive Odd";
      }
    } else if (number < 0) {
      if (number % 2 != 0) {
        return "Negative Odd";
      } else {
        return "Negative Even";
      }
    } else {
      return "Zero";
    }
  }
}