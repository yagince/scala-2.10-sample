package try_sample

import scala.concurrent.{Future, Promise, future, promise}
import scala.concurrent.ExecutionContext.Implicits.global

object PromiseSample02 extends App {
  object Numbers {
    def even(i: Int) = {
      if (i % 2 == 0) i
      else throw new IllegalArgumentException(s"${i} is not even.")
    }
  }

  val p: Promise[Int] = promise[Int]
  p completeWith future {
    Numbers.even(11)
  }

  p.future onSuccess {
    case _ => println("Success")
  }
  p.future onFailure  {
    case _ => println("Failure")
  }
}
