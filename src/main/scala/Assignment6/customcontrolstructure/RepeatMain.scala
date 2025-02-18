package Assignment6.customcontrolstructure

import Assignment6.customcontrolstructure.Repeat

object RepeatMain {
  def main(args: Array[String]): Unit = {
    println("Repeating block 3 times:")
    Repeat.repeat(3) {
      println("Hello, Scala!")
    }
  }
}

