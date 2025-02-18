package Assignment6.Resourcemanagement



object MainApp {
  def main(args: Array[String]): Unit = {
    val resource = new Resource()

    Using.using(resource) { res =>
      res.open()
      res.use()
    }
  }
}
