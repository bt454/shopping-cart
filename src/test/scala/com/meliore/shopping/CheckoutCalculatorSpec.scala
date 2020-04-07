package com.meliore.shopping

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CheckoutCalculatorSpec extends AnyWordSpec with Matchers {

  private val checkoutCalculator: CheckoutCalculator = new CheckoutCalculator

  "calculateTotal" when {
    "supplied with one apple" should {
      "produce a total cost of 60" in {
        checkoutCalculator.calculateTotal(List(Apple())) shouldBe 60
      }
    }

    "supplied with an empty list" should {
      "result in a total cost of 0" in {
        checkoutCalculator.calculateTotal(Nil) shouldBe 0
      }
    }

    "supplied with one orange" should {
      "result in a total cost of 25" in {
        checkoutCalculator.calculateTotal(List(Orange())) shouldBe 25
      }
    }

    "supplied with one orange and one apple" should {
      "result in a total cost of 85" in {
        checkoutCalculator.calculateTotal(List(Orange(), Apple())) shouldBe 85
      }
    }

    "supplied with one orange and two apples" should {
      "result in a total cost of 145" in {
        checkoutCalculator.calculateTotal(List(Orange(), Apple(), Apple())) shouldBe 145
      }
    }

    "supplied with two oranges and three apples in mixed order" should {
      "result in a total cost of 230" in {
        checkoutCalculator.calculateTotal(List(Apple(), Orange(), Apple(), Apple(), Orange())) shouldBe 230
      }
    }
  }
}
