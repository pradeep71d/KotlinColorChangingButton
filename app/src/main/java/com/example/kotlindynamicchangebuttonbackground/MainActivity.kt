package com.example.kotlindynamicchangebuttonbackground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var bb = 1;// bb=button background,bc=button change
        val bc = findViewById(R.id.b1) as Button
        bc.setOnClickListener {
            if (bb == 2) {
                bc.setBackgroundResource(R.drawable.btn_center_gradient)
                bb = 1;
            } else if (bb == 1) {
                bc.setBackgroundResource(R.drawable.btn_oval_gradient)
                bb = 2
            }
        }
    }
}
