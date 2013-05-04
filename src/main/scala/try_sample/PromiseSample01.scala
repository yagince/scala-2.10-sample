package try_sample

import scala.concurrent.{Promise, future, promise}
import scala.concurrent.ExecutionContext.Implicits.global

object PromiseSample01 extends App {
  object Numbers {
    def even(i: Int, p: Promise[Int]) = {
      if (i % 2 == 0) p success i
      else p failure new IllegalArgumentException(s"${i} is not even.")
    }
  }

  val p = promise[Int]
  val f = p.future

  val even = future {
    Numbers.even(11, p)
  }

  f.onSuccess{
    case _ => println("Success")
  }
  f.onFailure{
    case _ => println("Failure")
  }

}
