package com.pj.nativecore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pj.pubsub.Messenger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val messenger = Messenger()
    }
}