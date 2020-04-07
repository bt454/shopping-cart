package com.meliore.shopping

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CheckoutCalculatorSpec extends AnyWordSpec with Matchers {

  private val checkoutCalculator: CheckoutCalculator = new CheckoutCalculator

  "calculateTotal" when {
    "supplied with one apple" should {
      "produce a total cost of 60" in {
        checkoutCalculator.calculateTotal(List(Apple)) shouldBe 60
      }
    }
  }
}
