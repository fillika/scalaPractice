package lectures.part2oop

object Inheritance extends App {
  class Animal {
    protected def eat = println("Omnomnomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("Crunch crunch")
    }
  }

  val cat = new Cat;
  cat.crunch

  class Person(name: String, age: Int = 0)

  class Adult(name: String, age: Int, idCard: String) extends Person(name);

  class Dog extends Animal {
    override def eat = println("Dog says when it eat: crunch crunch")
  }

  val dog = new Dog
  dog.eat

  class SuperDog extends Dog {
    override def eat = {
      super.eat
      println("Crunching ,motherfucker, crunching, do you eat it?")
    }
  }
  val superDog = new SuperDog;
  superDog.eat
}
