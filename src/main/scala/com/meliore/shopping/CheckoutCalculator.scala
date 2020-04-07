package com.meliore.shopping

import com.meliore.shopping.IterableUtils.dropEveryNth
import com.meliore.shopping.ShopProduce.{Apple, Fruit, Orange}

class CheckoutCalculator {

  def calculateTotal(fruits: List[Fruit]): Double =
    fruits
      .groupBy(identity)
      .flatMap {
        case Apple()  -> apples  => dropEveryNth(apples, 2)
        case Orange() -> oranges => dropEveryNth(oranges, 3)
      }
      .map(_.cost)
      .sum

}
