package com.meliore.shopping

import scala.annotation.tailrec

object IterableUtils {

  def dropEveryNth[T](list: List[T], n: Int): List[T] = {
    if (n < 1)
      throw new IllegalArgumentException("n must be greater than or equal to 1")

    @tailrec
    def localDrop(countDown: Int, list: List[T], acc: List[T]): List[T] = (countDown, list) match {
      case (_, Nil)           => acc
      case (1, _ :: tail)     => localDrop(n, tail, acc)
      case (cd, head :: tail) => localDrop(cd - 1, tail, head :: acc)
    }

    localDrop(n, list, Nil).reverse
  }
}
