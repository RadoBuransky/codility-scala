import scala.collection.JavaConversions._

// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object Solution {
    def solution(A: Array[Int]): Int = {
        val n = A.length
        var result = Integer.MAX_VALUE
        var left = 0
        var right = A.sum
        for (p <- 1 to (n - 1)) {
            left += A(p - 1)
            right -= A(p - 1)
            val diff = Math.abs(left - right)
            if (diff < result)
              result = diff
        }
        result
    } 
}
