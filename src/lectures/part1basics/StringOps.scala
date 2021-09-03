package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala lang";

  println(str.charAt(2));
  println(str.substring(7, 11));
  println(str.substring(11));
  println(str.split(" ").toList);
  println(str.startsWith("Hello"))
  println(str.replace("lang", "DOGS"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "326";
  val number = aNumberString.toInt;
  println(number)

  println(str.take(10))

  //  S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old";
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 100} years old";

  println(greeting)
  println(anotherGreeting)

  //  F-interpolators
  val speed = 1.234568f
  val myth = f"$name%s can eat $speed%2.5f burgers per minute"

  println(myth)

  //  raw-interpolator
  val escaped = "This is a \n newline"
  println(raw"This is a \n newline");
  println(raw"$escaped");

}
