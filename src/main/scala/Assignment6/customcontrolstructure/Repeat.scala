package Assignment6.customcontrolstructure

object Repeat {
  def repeat(n: Int)(block: => Unit): Unit = {
    for (_ <- 1 to n) {
      block
    }
  }
}

