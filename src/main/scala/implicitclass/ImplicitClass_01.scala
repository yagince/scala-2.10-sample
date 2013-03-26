package implicitclass

object ImplicitClass_01 extends App {
  implicit class DoubleInt(i: Int) {
    def double = i * 2
  }
  println(1.double)

  class HalfInt(i: Int) {
    def half = i / 2
  }
  implicit def toHalfInt(i:Int) = new HalfInt(i)
  println(1.half)

}

