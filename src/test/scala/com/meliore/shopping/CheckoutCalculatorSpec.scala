package com.meliore.shopping

import com.meliore.shopping.ShopProduce.{Apple, Orange}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CheckoutCalculatorSpec extends AnyWordSpec with Matchers {

  private val checkoutCalculator: CheckoutCalculator = new CheckoutCalculator

  "calculateTotal" when {
    "supplied with one apple" should {
      "produce a total cost of 0.6" in {
        checkoutCalculator.calculateTotal(List(Apple())) shouldBe 0.6
      }
    }

    "supplied with an empty list" should {
      "result in a total cost of 0" in {
        checkoutCalculator.calculateTotal(Nil) shouldBe 0
      }
    }

    "supplied with one orange" should {
      "result in a total cost of 0.25" in {
        checkoutCalculator.calculateTotal(List(Orange())) shouldBe 0.25
      }
    }

    "supplied with one orange and one apple" should {
      "result in a total cost of 0.85" in {
        checkoutCalculator.calculateTotal(List(Orange(), Apple())) shouldBe 0.85
      }
    }

    "supplied with one orange and two apples" should {
      "result in a total cost of 0.85" in {
        checkoutCalculator.calculateTotal(List(Orange(), Apple(), Apple())) shouldBe 0.85
      }
    }

    "supplied with two oranges and three apples in mixed order" should {
      "result in a total cost of 1.7" in {
        checkoutCalculator.calculateTotal(List(Apple(), Orange(), Apple(), Apple(), Orange())) shouldBe 1.7
      }
    }
  }
}
