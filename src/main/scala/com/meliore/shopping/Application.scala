package com.meliore.shopping

object Application {

  private val checkoutSystem = new CheckoutSystem(new CheckoutCalculator, new CostFormatter)

  def main(args: Array[String]): Unit = {
    val fruits = args.map(ShopProduce.fromString).toList
    println("TOTAL COST: " + checkoutSystem.checkout(fruits))
  }
}
