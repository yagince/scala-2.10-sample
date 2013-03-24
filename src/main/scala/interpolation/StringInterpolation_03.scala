package interpolation

object StringInterpolation_03 extends App{
  // format

  val pi = 3.14
  val hoge = "hogehogehoge"

  println(f"$hoge is $pi%2.4f") // => hogehogehoge is 3.1400
  //println(f"$hoge is $pi%2.4d") // これはpiがDoubleなので、エラーになる
}
