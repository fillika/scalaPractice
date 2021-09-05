package lectures.part2oop

object Generics extends App {
  class MyList[+A] {
    // use the type A
    def add[B >: A](el: B): MyList[B] = ???
  }

  class MyMap[Key, Value];

  val listOfInt = new MyList[Int];
  val listOfStrings = new MyList[String];

  // generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  // variance problem
  class Animal

  class Cat extends Animal

  class Dog extends Animal

  class Kitty extends Cat

  //  List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Kitty]

  //  INVARIANCE
  class InvarianceList[A]

  val invarianceList: InvarianceList[Animal] = new InvarianceList[Animal];

  //  CONTRAVARIANCE
  class ContravarianceList[-A]

  val contravarianceList: ContravarianceList[Cat] = new ContravarianceList[Animal]

  class Cage[A <: Animal](animal: A)

  val cage = new Cage(new Dog);
}
