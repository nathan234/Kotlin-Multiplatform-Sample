package com.example.samplekmm3.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.samplekmm3.shared.Greeting
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greeting = Greeting()

        val tv: TextView = findViewById(R.id.text_view)
        val tv2: TextView = findViewById(R.id.text_view_2)
        tv.text = greeting.greeting()
        tv2.text = greeting.bye()
    }
}
