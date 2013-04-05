package valueclass.restriction

object ValueClassRestriction_03 extends App{
// 入れ子のクラス、トレイト、オブジェクトは持てない -> implementation restriction: nested class is not allowed in value class
//  class Hoge(val i: Int) extends AnyVal {
//    class Foo
//    trait Bar
//    object Piyo
//  }
}
