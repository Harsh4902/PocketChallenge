package com.example.pocketchallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pocketchallange.R

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        supportActionBar?.hide()
    }
}