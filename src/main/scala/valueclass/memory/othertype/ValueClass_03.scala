package valueclass.memory.othertype

object ValueClass_03 extends App {

  trait Hoge extends Any{ def name = "hoge" }
  case class Foo(val i: Int) extends AnyVal with Hoge

  def nameAsHoge(x: Hoge) = x.name
  def nameAsFoo(x: Foo) = x.name

  println(nameAsHoge(Foo(1)))
  println(nameAsFoo(Foo(1)))
}
