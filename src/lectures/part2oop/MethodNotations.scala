package lectures.part2oop

object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def isAlive: Boolean = true;
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie";
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times";
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1);
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def learns(thing: String) = s"$name is learning $thing"
    def learningScala = this learns ("Scala")
  }

  val mary = new Person("Mary", "Inception");

  println((mary + "the Rockstar") ())
  println((+mary).age)
  println(mary learns "OOP")
  println(mary.learningScala)
  println(mary(20))
}
