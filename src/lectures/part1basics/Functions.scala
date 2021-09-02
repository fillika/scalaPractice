package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b;
  }

  println(aFunction("Hello", 3));

  def aParameterLessFunc(): Int = 32;

  println(aParameterLessFunc())
  println(aParameterLessFunc)

  def aRepeatedFunc(aString: String, n: Int): String = {
    if (n == 1) aString;
    else aString + " " + aRepeatedFunc(aString, n - 1);
  }

  var result = aRepeatedFunc("One", 10);
  println(result)

  //  WHEN U NEED LOOPS, USE RECURSION?

  // Like closures
  def aBigFunction(n: Int): Int = {
    def aSmallFunc(a: Int, b: Int) = a + b;
    aSmallFunc(n, n - 1)
  }

  println(aBigFunction(10))

  //  Exercises

  //  1. greeting func
  def greet(name: String, age: Int) = s"Hello, my name is $name and I am $age years old";
  println(greet("Сашка", 620))

  // 2. Factorial func
  def factorialFunc(n: Int): Int = {
    if (n <= 0) 1;
    else n * factorialFunc(n - 1);
  }

  println(factorialFunc(3))

  //  3. Fibonacci func
  def fibonacci(x: Int): Int = {
    if (x <= 2) 1;
    else fibonacci(x - 1) + fibonacci(x - 2);
  }

  println(fibonacci(8))

  def isPrime(n: Int):Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t < 1) true;
      else n % t != 0 && isPrimeUntil(t - 1);
    }

    isPrimeUntil(n / 2);
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
