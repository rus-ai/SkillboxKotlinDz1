package ru.wtw.skillboxkotlindz1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    private var longButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonLeft).setOnClickListener(this)

        val rightButton = findViewById<Button>(R.id.buttonRight)
        rightButton.setOnClickListener{
            customOnClick()
        }

        this.longButton = findViewById(R.id.buttonLong)
        this.longButton!!.setOnClickListener {
                Log.i("DZ1", "Long button pressed")
        }
    }

    override fun onClick(v: View?) {
        Log.i("DZ1", "Left button pressed")
    }

    private fun customOnClick() {
        Log.i("DZ1", "Right button pressed")
    }

}


