package lectures.part2oop

object Exceptions extends App {
  val x: String = null
  //  println(x.length)

  def getInt(withException: Boolean): Int = {
    if (withException) throw new NullPointerException("NO INT FOR YOU")
    //    if (withException) throw new RuntimeException("NO INT FOR YOU")
    else println("get 42 for you")
    42;
  }

  try {
    getInt(true)
  } catch {
    case e: RuntimeException => println("Caught a RuntimeException")
    case e: NullPointerException => println("Null pointer exceptions")
  } finally {
    println("----- finally -----")
  }

  class MyException extends Exception("Hello СУКА");
  val exception = new MyException

  //  throw new OutOfMemoryError("OUT OF MEMORY MAN");
  //  throw new StackOverflowError("OUT OF MEMORY MAN");

  class OverflowException(msg: String) extends Exception;
  class UnderflowException(msg: String) extends Exception;
  class MathCalculationException(msg: String) extends Exception;

  class PocketCalc {
    private val MAX_VALUE: Int = 1000;
    private val MIN_VALUE: Int = -1000;

    def add(x: Int, y: Int) = {
      val result = x + y;
      if (result > MAX_VALUE) throw new OverflowException(s"Result is more than MAX VALUE: $MAX_VALUE")
      else println(result)
    }
    def subtract(x: Int, y: Int) = {
      val result = x - y;
      if (result < MIN_VALUE) throw new UnderflowException(s"Result is less than MIN VALUE: $MIN_VALUE")
      else println(result)
    }
    def divide(x: Int, y: Int) = {
      val result = x - y;
      if (result < MIN_VALUE) throw new MathCalculationException(s"Result is less than MIN VALUE: $MIN_VALUE")
      else println(result)
    }
  }

  println(Int.MaxValue)
  println(Int.MinValue)

}
