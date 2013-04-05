package valueclass.restriction

object ValueClassRestriction_01 extends App {
  class Hoge(val i:Int) extends AnyVal // OK
//  class Foo(val i:Int, val j:Int) extends AnyVal // NG -> value class needs to have exactly one public val parameter
//  class Bar(val hoge: Hoge) extends AnyVal // NG -> value class may not wrap another user-defined value class
  class Piyo1(val i:Int) // not value class
  class Piyo2(val piyo1: Piyo1) extends AnyVal //OK

//  class Name(val x: => String) extends AnyVal // NG -> `val' parameters may not be call-by-name
  // 複数のコンストラクタは持てない -> secondary constructor is not allowed in value class
//  class MultiConstructor(val x: Int) extends AnyVal {
//    def this(y: Int) = this(y.toString)
//  }
}
