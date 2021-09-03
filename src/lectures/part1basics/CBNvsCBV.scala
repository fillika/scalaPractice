package lectures.part1basics

// Call-by-Name vs Call-by-value
object CBNvsCBV extends App {
  def calledByValue(x: Long): Unit = {
    println("by value: " + x);
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by value: " + x);
    println("by value: " + x);
  }

  def calledWithMethodInside(): Unit = {
    println("by value: " + System.nanoTime());
    println("by value: " + System.nanoTime());
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
  calledWithMethodInside()

  def infinite():Int = 1 + infinite();
  def printFirst(x: Int, y: => Int) = println(x);

  printFirst(34, infinite());
}
