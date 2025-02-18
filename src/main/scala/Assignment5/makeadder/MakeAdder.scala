package Assignment5.makeadder

object MakeAdder {
  def makeAdder(x: Int): Int => Int = {
    y => x + y
  }
}
