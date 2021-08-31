package lectures.part1basics

object ValVarTypes extends App {
  var x = 2.2;
  var y = x;

  x = 45;
  println(x);
  println(y);
  println(y == x);

  def hello(name: String, surname: String): Unit = {
    println(s"Hello $name, $surname")
  };

  hello("Вася", "Пупкин");

  val aBoolean: Boolean = false;
  val aChar: Char = 'a';
  val aShort: Short = 15000;
  var aInt: Int = 2147483647;
  val aLong: Long = 546_546_541_325_465_463L;
  val aFloat: Float = 1.232323f;
  val aDouble: Double = 1.232323;

  println(aLong)
}
