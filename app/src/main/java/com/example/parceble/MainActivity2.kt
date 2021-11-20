package com.example.parceble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var bundle: Bundle? =intent.extras
        var data=bundle!!.get("key")
        Toast.makeText(this, "$data", Toast.LENGTH_SHORT).show()

    }
}