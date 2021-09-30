package com.example.signupkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.edt_User_name)
        var email = findViewById<EditText>(R.id.edt_email)
        var phone = findViewById<EditText>(R.id.edt_phone)
        var password = findViewById<EditText>(R.id.edt_password)
        var button = findViewById<Button>(R.id.button)

        var user = username.text.toString()
        var mail = email.text.toString()
        var no = phone.text.toString()
        var pass = password.text.toString()

        if(user.isEmpty())
        {
            username.setError("please enter your name")
        }
        else if(mail.isEmpty())
        {
            email.setError("please enter your mail id")
        }
        else if(no.isEmpty())
        {
            phone.setError("please enter your phone no")
        }
        else if(pass.isEmpty())
        {
            password.setError("please enter your password")
        }
        else
        {
            Toast.makeText(this,"please enter all the details",Toast.LENGTH_SHORT).show()
        }

        button.setOnClickListener {

        }


    }
}