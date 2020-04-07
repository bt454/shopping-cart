package com.meliore.shopping

class CheckoutCalculator {

  def calculateTotal(fruits: List[Fruit]): Double =
    fruits.foldLeft(0.0)(_ + _.cost)
}
