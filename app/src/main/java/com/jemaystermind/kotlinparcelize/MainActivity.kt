package com.jemaystermind.kotlinparcelize

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtra("user", User(0, "Jeremy Tecson"))
    startActivity(intent)
  }
}
