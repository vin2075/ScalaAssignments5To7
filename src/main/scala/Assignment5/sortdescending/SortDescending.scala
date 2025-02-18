package Assignment5.sortdescending

object SortDescending {
  def sortDescending(list: List[Int]): List[Int] = {
    list.sortWith((a, b) => a > b)
  }
}
