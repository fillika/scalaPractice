package lectures.part2oop

object OOBasics extends App {
  val person = new Person("Alex", 30);

  println(person.x)
  person.greet("John");
  person.greet();
  person.greet(20);
}

// class constructor
class Person(name: String, val age: Short) {
  //  class body
  val x = 2;

  //  methods
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name");

  //  overloading
  def greet(): Unit = println(s"Hi, I am ${this.name}");

  def greet(x: Int): Unit = println(s"Hi, this is $x")

  // multiple construction
  def this(name: String) = this(name, 0);

  def this() = this("John Doe");

  val authorCharlesDickens = new Writer("Charles", "Dickens", 1812);
  val authorCharlesDickens2 = new Writer("Charles", "Dickens", 1812);
  val novel = new Novel("Great Expectations", 1861, authorCharlesDickens)

  println(s"Author age is ${novel.authorAge}")
  println(s"Is written by Charles Dickens ${novel.isWrittenBy(authorCharlesDickens2)}")

  val counter = new Counter;
  counter.inc.count
  /*
   Novel and a Writer
   Writer: first name, surname, year, - method fullname
   Novel: name, year of release, author
   - authorAge
   - isWrittenBy(author)
   - copy(new year of release) = new Instance of novel
   */

  /*
  Counter class
  - receives an int value
  - method current count
  - method to increment/decrement => new Counter
  - overload inc/dev to receive an amount
   */
}

class Writer(firstName: String, lastName: String, val year: Int) {
  def fullName: String = s"$firstName $lastName"
}

class Novel(name: String, yearOfRelease: Int, author: Writer) {
  def authorAge = yearOfRelease - author.year;

  def isWrittenBy(author: Writer) = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author);
}

class Counter(val count: Int = 0) {
  def inc = {
    println("inc")
    new Counter(count + 1)
  }; // immutability

  def dec = {
    println("dec")
    new Counter(count - 1)
  };

  def inc(n: Int) = new Counter(count + n);

  def dec(n: Int) = new Counter(count - n);

  def print = println(count)
}
