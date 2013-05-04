package try_sample

import scala.concurrent._
import ExecutionContext.Implicits.global

object FutureSample02 extends App {
  object Numbers {
    def even(i: Int) = {
      if (i % 2 == 0) i
      else throw new IllegalArgumentException(s"${i} is not even.")
    }
  }

  val f: Future[Int] = future {
    Numbers.even(11)
  }
  f.onFailure {
    case e => println(e.getMessage)
  }
  f.onSuccess {
    case i => println(s"${i} is even.")
  }
}
