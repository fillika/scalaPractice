package lectures.print

object Print extends App {
  def ln(x: Short) = {
    println("-" * x)
  }
}

object Hey extends App {
  def sayHi(greet: String) = {
    println(s"Hello $greet")
  }
}