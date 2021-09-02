package lectures.part1basics

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n <= 1) 1;
    else n * factorial(n - 1);
  }

  def factorialHelper(x: Int, result: BigInt): BigInt = {
    if (x <= 1) result;
    else factorialHelper(x - 1, x * result);
  }


  println(factorialHelper(5, 1))
}
