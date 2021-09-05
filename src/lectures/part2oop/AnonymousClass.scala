package lectures.part2oop

object AnonymousClass extends App {
  abstract class Animal {
    def eat: Unit
  }

  //  anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahaha")
  }

  println(funnyAnimal)
  println(funnyAnimal.getClass)
}
