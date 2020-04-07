package com.meliore.shopping

sealed abstract class Fruit(val cost: Int)

case class Apple() extends Fruit(60)
case class Orange() extends Fruit(25)
