package valueclass.restriction

object ValueClassRestriction_07 extends App {
  class Hoge(val i:Int) extends AnyVal
//  class Foo(val j:Int) extends Hoge(j) // illegal inheritance from final class Hoge
}
