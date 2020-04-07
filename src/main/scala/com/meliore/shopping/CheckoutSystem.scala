package com.meliore.shopping

import com.meliore.shopping.ShopProduce.Fruit

class CheckoutSystem(checkoutCalculator: CheckoutCalculator, costFormatter: CostFormatter) {

  def checkout(fruits: List[Fruit]): String = {
    val total = checkoutCalculator.calculateTotal(fruits)
    costFormatter.format(total)
  }
}
