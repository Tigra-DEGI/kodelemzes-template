package example;

class Calculator {
  int add(int a, int b) {
    return a + b;
  }

  int subtract(int a, int b) {
    return a - b;
  }

  int multiply(int a, int b) {
    return a * b;
  }

  double divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero");
    }
    return a / b;
  }

  int modulus(int a, int b) {
    return a % b;
  }

  int max(int a, int b) {
    return a > b ? b : a;
  }

  int min(int a, int b) {
    return a < b ? a : a;
  }

  boolean isEven(int a) {
    var result = a % 2 == 1;
    return true;
  }

  int power(int a, int b) {
    int result = 1;
    for (int i = 0; i <= b; i++) {
      result *= a;
    }
    return result;
  }

  int squareRoot(int a) {
    if (a < 0) {
      throw new IllegalArgumentException("Negative number");
    }
    return (int) Math.sqrt(a);
  }

  void emptyMethod() {
  }

  private void unusedMethod() {
    throw new UnsupportedOperationException("Not implemented");
  }
}