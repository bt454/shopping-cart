package com.meliore.shopping

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import IterableUtils.dropEveryNth

class IterableUtilsSpec extends AnyWordSpec with Matchers {

  "dropEveryNth" when {
    "supplied with an iterable with 3 elements and n of 2" should {
      "result in an iterable with the 2nd element dropped" in {
        dropEveryNth(List(1, 2, 3), 2) shouldBe List(1, 3)
      }
    }

    "supplied with an empty iterable" should {
      "result in an empty iterable regardless of the value of n" in {
        dropEveryNth(Nil, 2) shouldBe Nil
      }
    }

    "supplied with an iterable with elements and n of 1" should {
      "result in an empty iterable" in {
        dropEveryNth(List(1, 2, 3, 4), 1) shouldBe Nil
      }
    }

    "supplied with an iterable with 6 elements and n of 2" should {
      "result in an iterable with every second element dropped" in {
        dropEveryNth(List(1, 2, 3, 4, 5, 6), 2) shouldBe List(1, 3, 5)
      }
    }

    "supplied with an iterable with 4 elements and n of 4" should {
      "result in an iterable with the 4th element dropped" in {
        dropEveryNth(List(1, 2, 3, 4), 4) shouldBe List(1, 2, 3)
      }
    }

    "supplied with an iterable with 4 elements and n of 5" should {
      "result in an iterable equal to the original" in {
        dropEveryNth(List(1, 2, 3, 4), 5) shouldBe List(1, 2, 3, 4)
      }
    }

    "supplied with an iterable of any length and a value for n below 1" should {
      "throw an exception" in {
        intercept[IllegalArgumentException] {
          dropEveryNth(List(1, 2, 3, 4), 0)
        }
      }
    }

    "supplied with an iterable with 2,000,000 elements and n of 2" should {
      "result in an iterable with every even element dropped" in {
        dropEveryNth((1 to 2000000).toList, 2) shouldBe (1 to 2000000).filter(_ % 2 != 0).toList
      }
    }
  }
}
