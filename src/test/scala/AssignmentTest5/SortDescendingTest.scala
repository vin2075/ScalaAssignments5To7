package AssignmentTest5

import Assignment5.sortdescending.SortDescending
import org.scalatest.funsuite.AnyFunSuite

class SortDescendingTest extends AnyFunSuite {
  test("sortDescending should return list sorted in descending order") {
    assert(SortDescending.sortDescending(List(5, 2, 8, 1)) == List(8, 5, 2, 1))
    assert(SortDescending.sortDescending(List(3, 3, 3)) == List(3, 3, 3))
  }
}

