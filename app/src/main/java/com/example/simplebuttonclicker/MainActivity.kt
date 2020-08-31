package com.example.simplebuttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)


		val bt = findViewById<Button>(R.id.button)
		bt.setOnClickListener {
			Toast.makeText(this, "made some noise", Toast.LENGTH_LONG).show()
		}


	}
}