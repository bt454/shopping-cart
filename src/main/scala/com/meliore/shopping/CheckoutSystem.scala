package com.meliore.shopping

class CheckoutSystem(checkoutCalculator: CheckoutCalculator, costFormatter: CostFormatter) {

  def checkout(fruits: List[Fruit]): String = {
    val total = checkoutCalculator.calculateTotal(fruits)
    costFormatter.format(total)
  }
}
