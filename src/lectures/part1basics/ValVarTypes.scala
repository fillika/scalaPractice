package lectures.part1basics

object ValVarTypes extends App {
  val x = 2.2;
  println(x);

  def hello(name: String, surname: String): Unit = {
    println(s"Hello $name, $surname")
  }

  hello("Вася", "Пупкин")
}
