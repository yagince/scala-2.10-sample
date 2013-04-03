package valueclass.implicitclass

object ImplicitConversions {
  implicit class Triple(val i: Int) extends AnyVal {
    def triple = i * 3
  }
  class Half(val i:Int) extends AnyVal {
    def half = i / 2
  }
  implicit def toHalf(i: Int) = new Half(i)

  class Quarter(i:Int) {
    def quarter = i / 4
  }
  implicit def toQuater(i: Int) = new Quarter(i)
}
