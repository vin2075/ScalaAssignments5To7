package Assignment6.Resourcemanagement

object Using {
  def using[T <: AutoCloseable](resource: T)(block: T => Unit): Unit = {
    try {
      block(resource)
    } finally {
      resource.close()
    }
  }
}


