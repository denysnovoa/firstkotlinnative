package com.app.firstkotlinnative.ui.utils.textwatcher

import android.text.Editable
import android.widget.EditText
import com.app.firstkotlinnative.ui.utils.toDecimalFormat
import java.lang.ref.WeakReference

class MoneyTextWatcher(editText: EditText) : TextWatcherAdapter() {

  private var editTextWeakReference: WeakReference<EditText?> = WeakReference(editText)

  override fun afterTextChanged(editable: Editable) {
    val editText: EditText = editTextWeakReference.get() ?: return
    editText.removeTextChangedListener(this)
    // val parsed: BigDecimal? = parseToBigDecimal(editable.toString(), locale)
    //  val formatted: String = getCurrencyInstance(locale).format(parsed)

    // val formatted: String = NumberFormat.getInstance(locale).format(parsed)

    val parsed = editable.toString().replace(".", "").toBigIntegerOrNull() ?: 0.toBigInteger()
    val formatted = parsed.toDecimalFormat()

    editText.setText(formatted)
    editText.setSelection(formatted.length)
    editText.addTextChangedListener(this)
  }
}