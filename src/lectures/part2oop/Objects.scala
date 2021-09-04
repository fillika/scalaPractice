package lectures.part2oop

object Objects extends App {
  object Person {
    val N_EYES = 2;
    def canFly: Boolean = false;

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {

  }

  val mary = new Person("Mary")
  val john = new Person("John")

  println(Person.N_EYES)
  println(Person.canFly)

  val bobbie = Person(mary, john)

  //  Scala apps = Scala object with
  //  def main(args: Array[String]): Unit


}

