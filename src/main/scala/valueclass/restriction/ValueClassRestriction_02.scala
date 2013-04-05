package valueclass.restriction

object ValueClassRestriction_02 extends App {
//  class Specialized[@specialized(Int, Long) A](val a:A) extends AnyVal // NG -> type parameter of value class may not be specialized
}
