import scala.collection.JavaConversions._
import math._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
  def solution(X: Int, Y: Int, D: Int): Int = {
    ceil((Y - X) / D.toDouble).toInt
  }
}