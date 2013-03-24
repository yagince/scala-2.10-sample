package interpolation

object StringInterpolation_04 extends App {
  println(s"100 + 1 = ${100+1}")                       // 100 + 1 = 101
  println(StringContext("100 + 1 = ", "").s(100+1))    // 100 + 1 = 101
  println(StringContext("100 + 1 = ", "%5d").f(100+1)) // 100 + 1 =   101
}
