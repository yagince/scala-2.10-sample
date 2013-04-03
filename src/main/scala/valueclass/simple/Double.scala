package valueclass.simple

class Double(val i: Int) extends AnyVal with Hoge{
//  val tmpDouble = i * 2 // これは定義できない
  def double = i*2

  // 以下はコンパイルエラー
//  object Foo {
//    val foo = "foo"
//  }
//  class Foo
//  trait FooTrait
}

trait Hoge extends Any{ //汎用トレイトである必要がある
  def hoge = "hoge"
}

// これはvalがコンストラクタ引数ではないので、コンパイルエラー
//class Ten extends AnyVal{
//  val value = 10
//  def add(i:Int) = value + i
//}
