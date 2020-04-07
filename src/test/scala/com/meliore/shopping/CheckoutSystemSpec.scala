package com.meliore.shopping

import com.meliore.shopping.ShopProduce.{Apple, Orange}
import org.mockito.MockitoSugar
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CheckoutSystemSpec extends AnyWordSpec with Matchers with MockitoSugar {

  private val checkoutCalculator = mock[CheckoutCalculator]
  private val costFormatter = mock[CostFormatter]
  private val checkoutSystem = new CheckoutSystem(checkoutCalculator, costFormatter)

  "checkout" when {
    "supplied with a list of fruits" should {
      "result in the total cost as a string with currency" in {
        val fruits = List(Apple(), Orange(), Apple(), Apple(), Orange(), Apple(), Orange(), Orange(), Apple())
        val total = 3.40

        when(checkoutCalculator.calculateTotal(fruits)).thenReturn(total)
        when(costFormatter.format(total)).thenReturn("£3.40")

        checkoutSystem.checkout(fruits) shouldBe "£3.40"
      }
    }
  }
}
