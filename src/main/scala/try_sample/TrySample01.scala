package try_sample

import scala.util.Try

object TrySample01 extends App {
  object Numbers {
    def even(i: Int) = {
      if (i % 2 == 0) i
      else throw new IllegalArgumentException(s"${i} is not even.")
    }
  }

  Try(Numbers.even(11)).map(println).getOrElse(println("not even."))
  Try(Numbers.even(10)).map(println).getOrElse(println("not even."))
  Try(Numbers.even(11)).toOption.map(println).getOrElse(println("not even."))
}
