import scala.collection.JavaConversions._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(A: Array[Int]): Int = {
    var acc = 0
    for (i <- 0 to (A.length - 1))
      acc += (i + 1) - A(i)
    acc + (A.length + 1)
  }
}