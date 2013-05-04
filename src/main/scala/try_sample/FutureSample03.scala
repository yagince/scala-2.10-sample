package try_sample

import scala.concurrent._
import ExecutionContext.Implicits.global

object FutureSample03 extends App {
  object Numbers {
    def even(i: Int) = {
      if (i % 2 == 0) i
      else throw new IllegalArgumentException(s"${i} is not even.")
    }
    def equal(i: Int, j: Int) = {
      if (i == j) i
      else throw new IllegalArgumentException(s"${i} is not ${j}.")
    }
  }

  val equal: Future[Int] = future {
    Numbers.even(2)
  }.map { i =>
    Numbers.equal(i, 10)
  }

  equal.onSuccess{
    case i => println(i)
  }

  equal.onFailure{
    case e => println(e.getMessage)
  }
}
