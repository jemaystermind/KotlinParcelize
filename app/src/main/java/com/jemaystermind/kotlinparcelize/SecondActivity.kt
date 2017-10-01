package com.jemaystermind.kotlinparcelize

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class SecondActivity : AppCompatActivity() {

  private val TAG = "SecondActivity"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val user = intent.extras.getParcelable<User>("user")
    Log.i(TAG, "User=$user")
  }
}
