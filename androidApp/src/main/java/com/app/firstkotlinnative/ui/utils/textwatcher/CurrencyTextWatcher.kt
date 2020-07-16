package com.app.firstkotlinnative.ui.utils.textwatcher

import android.text.Editable
import android.text.TextWatcher
import java.text.NumberFormat

class CurrencyTextWatcher : TextWatcher {
  var mEditing = false

  @Synchronized
  override fun afterTextChanged(s: Editable) {
    if (!mEditing) {
      mEditing = true
      val digits: String = s.toString().replace("\\D", "")


      val nf: NumberFormat = NumberFormat.getCurrencyInstance()
      try {
        val formatted: String = nf.format(digits.toDouble() / 100)
        s.replace(0, s.toString().length, formatted)
      } catch (nfe: NumberFormatException) {
        s.clear()
      }
      mEditing = false
    }
  }

  override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
  override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

}