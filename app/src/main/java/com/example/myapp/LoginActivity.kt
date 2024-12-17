package com.example.myapp

import ProfileActivity
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity {



    class LoginActivity : AppCompatActivity(){
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.profile_main)
            val username:  EditText= findViewById(R.id.editTextText)
            val email:  EditText= findViewById(R.id.editTextTextEmailAddress)
            val phone: EditText= findViewById(R.id.editTextPhone)
            val password: EditText = findViewById(R.id.editTextTextPassword)

            val loginButton: Button = findViewById(R.id.button)


            loginButton.setOnClickListener{
                val nameText = username.text.toString().trim()
                val emailText = email.text.toString().trim()
                val passwordText = password.text.toString().trim()
                val phoneText = phone.text.toString().trim()

                if (nameText.isBlank()){
                    username.error  = "Username is required"
                }else if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
                    email.error = "Invalid email address"
                }else if (passwordText.isBlank()) {
                    password.error = "Password is required"
                }else if (phoneText.isBlank()) {
                    phone.error = "Password is required"
                }else {

                    val intent = Intent(this, ProfileActivity::class.java)
                    intent.putExtra("name", nameText)
                    startActivity(intent)
                }

            }
        }
    }
}