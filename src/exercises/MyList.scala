package exercises

abstract class MyList[+A] {
  /*
   head = first el of instance
   tail = remainder of the list
   isEmpty = is this list empty
   add(integer) => new list with this element added
   toString => a string representation of the list
   */
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](el: B): MyList[B]
  def printElements: String
  override def toString: String = s"[$printElements]"
}

object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](el: B): MyList[B] = new Cons(el, Empty)
  def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
  def head: A = h
  def tail: MyList[A] = t○
  def isEmpty: Boolean = false
  def add[B >: A](el: B): MyList[B] = new Cons(el, this)
  def printElements: String = {
    if (t.isEmpty) "" + h
    else h + " " + t.printElements;
  }
}

object ListTest extends App {
  val listOfIntegers: MyList[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
  val listOfStrings: MyList[String] = new Cons("Hello", new Cons("Scala", new Cons("!", Empty)))

  println(listOfIntegers.toString)
  println(listOfStrings.toString)
}