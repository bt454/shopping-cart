package com.meliore.shopping

class CheckoutCalculator {

  def calculateTotal(fruits: List[Fruit]): Int =
    fruits.foldLeft(0)(_ + _.cost)
}
