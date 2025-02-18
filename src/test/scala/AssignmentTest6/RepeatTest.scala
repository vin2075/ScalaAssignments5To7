package AssignmentTest6

import Assignment6.customcontrolstructure.Repeat
import org.scalatest.funsuite.AnyFunSuite
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class RepeatTest extends AnyFunSuite {
  test("repeat should execute block n times") {
    val output = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(output)) {
      Repeat.repeat(3) {
        println("Test")
      }
    }
    val result = output.toString.split("\n").count(_ == "Test")
    assert(result == 3)
  }
}

