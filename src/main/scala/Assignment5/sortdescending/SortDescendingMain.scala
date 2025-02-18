package Assignment5.sortdescending

import Assignment5.sortdescending.SortDescending

object SortDescendingMain {
  def main(args: Array[String]): Unit = {
    println("Enter numbers separated by spaces:")
    val input = scala.io.StdIn.readLine()
    val numbers = input.split(" ").map(_.toInt).toList
    val sortedNumbers = SortDescending.sortDescending(numbers)
    println(s"Sorted numbers in descending order: ${sortedNumbers.mkString(", ")}")
  }
}

