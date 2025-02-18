package Assignment7.composition

import Assignment7.classhierarchy.Smartphone
import Assignment7.classhierarchy.Laptop
object MainApp {
  def main(args: Array[String]): Unit = {
    val laptop = new Laptop
    val smartphone = new Smartphone
    val store = new DeviceStore

    store.addDevice(laptop)
    store.addDevice(smartphone)

    store.powerOnAllDevices().foreach(println)
    // Expected Output:
    // "Laptop is booting up!"
    // "Smartphone is starting!"
  }
}

