package AssignmentTest5

import Assignment5.computearea.ComputeArea
import org.scalatest.funsuite.AnyFunSuite

class ComputeAreaTest extends AnyFunSuite {
  test("computeArea should return correct area for given radius") {
    assert(Math.abs(ComputeArea.computeArea(2) - 12.5664) < 0.0001)
    assert(Math.abs(ComputeArea.computeArea(0) - 0.0) < 0.0001)
  }
}
