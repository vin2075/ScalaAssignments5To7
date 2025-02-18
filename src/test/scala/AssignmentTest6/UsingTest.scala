package AssignmentTest6

import Assignment6.Resourcemanagement.Resource
import Assignment6.Resourcemanagement.Using
import org.scalatest.funsuite.AnyFunSuite
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class UsingTest extends AnyFunSuite {
  test("using should properly manage resource") {
    val output = new ByteArrayOutputStream()
    Console.withOut(new PrintStream(output)) {
      val resource = new Resource()
      Using.using(resource) { res =>
        res.open()
        res.use()
      }
    }
    val result = output.toString.split("\n")
    assert(result.contains("Resource opened"))
    assert(result.contains("Resource in use"))
    assert(result.contains("Resource closed"))
  }
}

