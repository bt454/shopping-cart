package com.meliore.shopping

import com.meliore.shopping.ShopProduce.{Apple, fromString}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ShopProduceSpec extends AnyWordSpec with Matchers {

  "fromString" when {
    "supplied with the name Apple" should {
      "result in a new object of type Apple" in {
        fromString("Apple") shouldBe Apple()
      }
    }
  }
}
