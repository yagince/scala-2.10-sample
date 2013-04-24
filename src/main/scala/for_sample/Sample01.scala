package for_sample

object Sample01 extends App {
  val a: Option[Int] = Some(1)
  val b: Option[Int] = None

  val result:Option[Int] =
    for {
      c <- a
      d <- b
    } yield {
      c * d
    }

  result match {
    case Some(x) => println(x)
    case None => println("failed")
  }
}
