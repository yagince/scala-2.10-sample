package try_sample

import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.Try

object FutureSample01 extends App {
  object Example {
    def double(i: Int) = i * 2
  }

  val f: Future[Int] = future {
    Thread.sleep(1000)
    Example.double(10)
  }

  f.onComplete { t: Try[Int] =>
    println(t.get)
  }
}
