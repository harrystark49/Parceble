package com.example.parceble

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data=user("harry","stark", userinfo("hari","min"))
        move.setOnClickListener {
            var intnet= Intent(this,MainActivity2::class.java)

            //we cannot send the objects throgh the put method if we dont use parceble
            intnet.putExtra("key",data)
            startActivity(intnet)
        }
    }
}
