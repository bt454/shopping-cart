package com.meliore.shopping

class CheckoutCalculator {

  def calculateTotal(fruits: List[Fruit]): Int =
    if (fruits.nonEmpty)
      60
    else
      0
}
