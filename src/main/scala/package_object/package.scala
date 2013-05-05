package object package_object {
  def hoge = "hoge"

  implicit class StringExtention(val s: String) extends AnyVal {
    def isNotEmpty = !s.isEmpty
  }
}
