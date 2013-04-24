package for_sample

object Sample02 extends App {
  val a: Option[Int] = Some(1)
  val b: Option[Int] = None

  (for {
    c <- a
    d <- b
  } yield {
    c * d
  }) match { // これはコンパイルエラー
    case Some(x) => println(x)
    case None => println("failed")
//  } match { // これはコンパイルできる（Noneの場合は以下に行かない
//    case x:Int => println(x)
//    case _ => println("failed")
  }

}
