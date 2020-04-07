package com.meliore.shopping

class CostFormatter {

  def format(valueInPounds: Double): String =
    f"£$valueInPounds%1.2f"
}
