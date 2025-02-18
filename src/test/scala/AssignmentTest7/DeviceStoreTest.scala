package AssignmentTest7

import Assignment7.classhierarchy.Smartphone
import Assignment7.classhierarchy.Laptop
import Assignment7.composition.DeviceStore
import org.scalatest.funsuite.AnyFunSuite

class DeviceStoreTest extends AnyFunSuite {
  test("DeviceStore should store devices and power them on") {
    val store = new DeviceStore
    val laptop = new Laptop
    val smartphone = new Smartphone

    store.addDevice(laptop)
    store.addDevice(smartphone)

    assert(store.powerOnAllDevices() == List("Laptop is booting up!", "Smartphone is starting!"))
  }
}

