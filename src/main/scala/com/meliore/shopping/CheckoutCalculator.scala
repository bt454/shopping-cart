package com.meliore.shopping

import com.meliore.shopping.ShopProduce.Fruit

class CheckoutCalculator {

  def calculateTotal(fruits: List[Fruit]): Double =
    fruits.foldLeft(0.0)(_ + _.cost)
}
