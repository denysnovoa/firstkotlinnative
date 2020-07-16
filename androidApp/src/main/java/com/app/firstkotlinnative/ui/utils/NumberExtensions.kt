package com.app.firstkotlinnative.ui.utils

import java.math.BigInteger
import java.text.DecimalFormat

fun Int.toDecimalFormat(format: String = DECIMAL_DEFAULT_FORMAT): String {
  return DecimalFormat(format).format(this)
}

fun BigInteger.toDecimalFormat(format: String = DECIMAL_DEFAULT_FORMAT): String {
  return DecimalFormat(format).format(this)
}
private const val DECIMAL_DEFAULT_FORMAT = "#,###,##0"