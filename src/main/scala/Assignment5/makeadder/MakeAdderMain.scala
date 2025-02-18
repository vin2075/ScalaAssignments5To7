package Assignment5.makeadder

object MakeAdderMain {
  def main(args: Array[String]): Unit = {
    println("Enter a number to create an adder function:")
    val x = scala.io.StdIn.readInt()
    val adder = MakeAdder.makeAdder(x)

    println(s"Adder function created with base $x. Enter a number to add:")
    val y = scala.io.StdIn.readInt()
    val result = adder(y)
    println(s"Result of adding $x and $y: $result")
  }
}

