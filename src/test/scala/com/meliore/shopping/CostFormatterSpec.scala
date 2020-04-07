package com.meliore.shopping

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CostFormatterSpec extends AnyWordSpec with Matchers {

  private val costFormatter: CostFormatter = new CostFormatter

  "format" when {
    "supplied with a cost above £1 with pence" should {
      "result in cost in pounds as string with £ prefix" in {
        costFormatter.format(2.06) shouldBe "£2.06"
      }
    }

    "supplied with a cost below £1" should {
      "result in cost in pounds as string with £ prefix and expected leading zeros before and after decimal point" in {
        costFormatter.format(0.06) shouldBe "£0.06"
      }
    }

    "supplied with a cost above £1 without remaining pence" should {
      "result in cost in pounds as string with £ prefix and two zeros after decimal point" in {
        costFormatter.format(206) shouldBe "£206.00"
      }
    }
  }
}
