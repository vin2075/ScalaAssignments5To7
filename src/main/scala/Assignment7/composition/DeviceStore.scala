package Assignment7.composition

import Assignment7.classhierarchy.ElectronicDevice
class DeviceStore {
  private var devices: List[ElectronicDevice] = List()

  def addDevice(device: ElectronicDevice): Unit = {
    devices = devices :+ device
  }

  def powerOnAllDevices(): List[String] = {
    devices.map(_.powerOn())
  }
}

