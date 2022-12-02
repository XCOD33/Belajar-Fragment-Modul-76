package com.xcod33.fragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFragment1 = findViewById<Button>(R.id.btnFragment1)
        val btnFragment2 = findViewById<Button>(R.id.btnFragment2)
        val btnFragment3 = findViewById<Button>(R.id.btnFragment3)

        btnFragment1.setOnClickListener() {
            val fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.f1Movie, Fragment1())
            fr.commit()
        }

        btnFragment2.setOnClickListener() {
            val fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.f1Movie, Fragment2())
            fr.commit()
        }

        btnFragment3.setOnClickListener() {
            val fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.f1Movie, Fragment3())
            fr.commit()
        }

        val fr = supportFragmentManager.beginTransaction()
        fr.add(R.id.f1Movie, Fragment1())
        fr.commit()

        Log.i("Main Activity","OnCreate")
    }
}