package com.example.responsi117

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val Nama =findViewById<EditText>(R.id.etnama)
        val Emaill=findViewById<EditText>(R.id.username)
        val Passs=findViewById<EditText>(R.id.pass)

        btn_input.setOnClickListener(){
            val nama=Nama.text.toString()
            val username=Emaill.text.toString()
            val Pass=Passs.text.toString()

            intent= Intent(this@SecondActivity, dashboard::class.java)
            intent.putExtra("Nama",nama)
            intent.putExtra("Emaill", username)
            intent.putExtra("Passs", Pass)
            startActivity(intent)
        }
    }
}
