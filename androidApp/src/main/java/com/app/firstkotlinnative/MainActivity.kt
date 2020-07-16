package com.app.firstkotlinnative

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.app.firstkotlinnative.ui.utils.textwatcher.MoneyTextWatcher

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val greetingTex = this.findViewById<TextView>(R.id.greetingTitle)

    greetingTex.text = Greeting().greeting()

    val savingsEditText = this.findViewById<EditText>(R.id.savingsEditText)

    //  savingsEditText.addTextChangedListener(CurrencyTextWatcher())
    savingsEditText.addTextChangedListener(
      MoneyTextWatcher(
        savingsEditText
      )
    )
//    savingsEditText.addTextChangedListener(
//      NumberFormatterTextWatcher(NumberFormat.getInstance(Locale.getDefault()) as DecimalFormat){
//        }
//      )
//    )
  }
}