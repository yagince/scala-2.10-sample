package valueclass.memory.array

object ValueClass_04 extends App {
  case class Hoge(val hoge: String) extends AnyVal

  val hoge = Hoge("aaaa").hoge
  val array = Array[Hoge](Hoge("str"))
  val list = List[Hoge](Hoge("str"))
  val seq = Seq[Hoge](Hoge("str"))
  val set = Set[Hoge](Hoge("str"))
  val map = Map[Hoge, Hoge](Hoge("key") -> Hoge("value"))
}
