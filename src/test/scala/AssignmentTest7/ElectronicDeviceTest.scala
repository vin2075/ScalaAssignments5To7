package AssignmentTest7

import Assignment7.classhierarchy.Laptop
import Assignment7.classhierarchy.Smartphone
import org.scalatest.funsuite.AnyFunSuite

class ElectronicDeviceTest extends AnyFunSuite {
  test("Laptop should power on with correct message") {
    val laptop = new Laptop
    assert(laptop.powerOn() == "Laptop is booting up!")
  }

  test("Smartphone should power on with correct message") {
    val smartphone = new Smartphone
    assert(smartphone.powerOn() == "Smartphone is starting!")
  }
}

