package Assignment5.computearea

import Assignment5.computearea.ComputeArea

object ComputeAreaMain {
  def main(args: Array[String]): Unit = {
    println("Enter the radius of the circle:")
    val radius = scala.io.StdIn.readDouble()
    val area = ComputeArea.computeArea(radius)
    println(s"The area of the circle with radius $radius is: $area")
  }
}

