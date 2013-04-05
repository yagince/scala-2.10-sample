package valueclass.restriction

object ValueClassRestriction_05 extends App {
  // これはNG
//  class Wrapper {
//    class Hoge(val i:Int) extends AnyVal {
//    }
//  }
  //　これはOK
  object Wrapper {
    class Hoge(val i:Int) extends AnyVal {
    }
  }
}
