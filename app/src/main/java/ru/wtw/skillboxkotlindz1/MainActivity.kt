package ru.wtw.skillboxkotlindz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonLong).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        Log.i("DZ1", "Long button pressed")
        TODO("Not yet implemented")
    }
}