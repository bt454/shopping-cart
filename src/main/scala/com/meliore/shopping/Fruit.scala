package com.meliore.shopping

sealed abstract class Fruit(val cost: Double)

case class Apple() extends Fruit(0.6)
case class Orange() extends Fruit(0.25)
