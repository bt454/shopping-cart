package com.meliore.shopping

import com.meliore.shopping.ShopProduce.{Apple, Orange, fromString}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ShopProduceSpec extends AnyWordSpec with Matchers {

  "fromString" when {
    "supplied with the name Apple" should {
      "result in a new object of type Apple" in {
        fromString("Apple") shouldBe Apple()
      }
    }

    "supplied with the name Orange" should {
      "result in a new object of type Orange" in {
        fromString("Orange") shouldBe Orange()
      }
    }
  }
}
