package com.meliore.shopping

sealed trait Fruit {
  val cost: Int
}

case object Apple extends Fruit {
  override val cost: Int = 60
}

case object Orange extends Fruit {
  override val cost: Int = 25
}
