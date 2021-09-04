package lectures.part2oop

object AbstractDataTypes extends App {
  abstract class Animal {
    val creatureType: String;
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Dug"
    override def eat: Unit = println(s"$creatureType: Crunch crunch")
  }

  trait Bird
  trait AngryBird
  class Human
  abstract class Robot
  class Mixed extends Human with Bird with AngryBird

  val dog = new Dog;
  dog.eat

  //  traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "Crocodile"
    def eat: Unit = println(s"$creatureType: Crunch crunch")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val croc = new Crocodile;
  croc.eat
  croc.eat(dog)
}
