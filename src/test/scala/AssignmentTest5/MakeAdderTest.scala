package AssignmentTest5
import Assignment5.makeadder.MakeAdder
import org.scalatest.funsuite.AnyFunSuite

class MakeAdderTest extends AnyFunSuite {
  test("makeAdder should return a function that adds x to input") {
    val add5 = MakeAdder.makeAdder(5)
    assert(add5(3) == 8)
    assert(add5(0) == 5)

    val add10 = MakeAdder.makeAdder(10)
    assert(add10(10) == 20)
  }

}

