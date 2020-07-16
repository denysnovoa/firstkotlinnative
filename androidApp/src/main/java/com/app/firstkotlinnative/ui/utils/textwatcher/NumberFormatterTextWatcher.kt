package com.app.firstkotlinnative.ui.utils.textwatcher

import android.text.Editable
import android.text.Selection
import android.util.Log
import com.app.firstkotlinnative.BuildConfig
import java.text.NumberFormat

//open class NumberFormatterTextWatcher(private val formatter: NumberFormat) :
//  TextWatcherAdapter() {
//
//  private var isSelfChange = false
//
//  override fun afterTextChanged(s: Editable) {
//    if (isSelfChange) {
//      // Ignore changes caused by Editable.replace()
//      return
//    }
//    val formattedText = formatInput(s.toString())
//    val rememberedPosition = Selection.getSelectionEnd(s)
//    val initialLength = s.length
//    val endLength = formattedText.length
//    val selection = rememberedPosition + endLength - initialLength
//    isSelfChange = true
//    s.replace(0, s.length, formattedText, 0, formattedText.length)
//    if (formattedText == s.toString()) {
//      tryToSetSelection(s, selection)
//    }
//    onValueChanged(stripSeparators(s.toString()))
//    isSelfChange = false
//  }
//
//  private fun tryToSetSelection(s: Editable, selection: Int) {
//    try {
//      Selection.setSelection(s, selection)
//    } catch (e: IndexOutOfBoundsException) {
//      if (BuildConfig.DEBUG) {
//        Log.e(javaClass.simpleName, "", e)
//      }
//    }
//  }
//
//  private fun formatInput(s: String): String {
//    val numericValue = stripSeparators(s)
//    return if (numericValue.trim { it <= ' ' }.isEmpty()) {
//      // Allow the empty string to be shown, instead of showing 0 as default
//      s
//    } else formatter.format(java.lang.Long.valueOf(numericValue))
//  }
//
//  private fun stripSeparators(s: String): String {
//    return s.replace("[^\\d]".toRegex(), "")
//  }
//
//  abstract fun onValueChanged(value: String?)
//}
