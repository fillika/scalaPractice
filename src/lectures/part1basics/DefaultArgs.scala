package lectures.part1basics

object DefaultArgs extends App {
  def trFactorial(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc;
    else trFactorial(n - 1, n * acc);
  }

  val fact10 = trFactorial(10);

  def savePicture(width: Int = 1920, height: Int = 1080, format: String = "jpg"): Unit = println(s"Saving picture with format=$format and width: $width and height: $height");
  savePicture()
  savePicture(800, 600)
  savePicture(format = "bmp", height = 360)
}
