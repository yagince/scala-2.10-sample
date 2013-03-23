package interpolation

object StringInterpolation extends App {
  val hoge = "hoge"

  println(s"Hello $hoge!")

  println(s"${1 + 1}")

  def test = 1 + 1

  println(s"${test}")
  println(s"$test")

  def test2(i:Int) = i*2

  println(s"${test2(2)}")
  //println(s"$test2(2)") // これはできない

  println(s"${def m(i:Int) = i * 10; m(100)}")
}
