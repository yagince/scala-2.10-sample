package implicitclass

object ImplicitClasses {
  implicit class TripleInt(i: Int) {
    def triple = i * 3
  }
}

// こうは書けない
//implicit class TripleInt(i: Int) {
//  def triple = i * 3
//}

object ImplicitClass_02 extends App {
  import ImplicitClasses._
  println(1.triple)
}
