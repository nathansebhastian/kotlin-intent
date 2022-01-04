package org.metapx.kotlinintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity = findViewById<Button>(R.id.button_move)

        btnMoveActivity.setOnClickListener {
            // Creating an explicit intent
            intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val btnBrowser = findViewById<Button>(R.id.button_browser)

        btnBrowser.setOnClickListener {
            // Creating an implicit intent
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://metapx.org"))
            startActivity(intent)
        }
    }
}