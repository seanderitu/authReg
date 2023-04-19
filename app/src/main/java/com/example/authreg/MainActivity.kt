package com.example.authreg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var FirstName:EditText
    lateinit var SecondName:EditText
    lateinit var Email:EditText
    lateinit var Password:EditText
    lateinit var btnLogin:Button
    lateinit var btnCreate:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirstName=findViewById(R.id.edt_fname)
        SecondName=findViewById(R.id.edt_sname)
        Email=findViewById(R.id.edt_email)
        Password=findViewById(R.id.edt_pass)
        btnLogin=findViewById(R.id.btnlogin)
        btnCreate=findViewById(R.id.btncreateacc)
        
        btnLogin.setOnClickListener{
            Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show()


        }
        btnCreate.setOnClickListener{
            Toast.makeText(this, "Created an account", Toast.LENGTH_SHORT).show()

            var gotologin = Intent(this,loginactivity::class.java)
            startActivity(gotologin)
        }
    }
}