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
  }
}
