package Assignment6.Resourcemanagement

class Resource extends AutoCloseable {
  def open(): Unit = println("Resource opened")
  def use(): Unit = println("Resource in use")
  override def close(): Unit = println("Resource closed")
}
