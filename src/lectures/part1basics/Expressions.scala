package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2;
  println(x);

  val aCondition = true;
  val aConditionValue = if (aCondition) 5 else 3;
  println(aConditionValue);

  var i = 0;

  while (i < 10) {
    println(i);
    i += 1;
  }

  // EVERYTHING in Scala is an expressions

  val aWeirdValue = (i = 3);

  // Code blocks

  val aCodeBLock: String = {
    val y = 2;
    val z = y + 1;

    if (z > 2) "Hello" else "Goodbye"
  }

  println(aCodeBLock);
}
