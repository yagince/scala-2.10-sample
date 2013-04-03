package valueclass.memory.patternmatch

object ValueClass_05 extends App {
  case class Hoge(val hoge: String) extends AnyVal

  Hoge("aaa") match {
    case Hoge(x) => println(x)
  }

  val hoge = Hoge("bbb")
  if (hoge.isInstanceOf[Hoge]) println(hoge.hoge)

  val hoge2 = Hoge("ccc")
  if (hoge.hoge == "ccc") println("match")
}
