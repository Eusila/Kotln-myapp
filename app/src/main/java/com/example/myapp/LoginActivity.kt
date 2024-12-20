package com.example.myapp

import ProfileActivity
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_main)


        val username: EditText = findViewById(R.id.editTextText)
        val email: EditText = findViewById(R.id.editTextTextEmailAddress)
        val phone: EditText = findViewById(R.id.editTextPhone)
        val password: EditText = findViewById(R.id.editTextTextPassword)
        val loginButton: Button = findViewById(R.id.button)


        loginButton.setOnClickListener {
            val nameText = username.text.toString().trim()
            val emailText = email.text.toString().trim()
            val passwordText = password.text.toString().trim()
            val phoneText = phone.text.toString().trim()


            when {
                nameText.isBlank() -> username.error = "Username is required"
                !Patterns.EMAIL_ADDRESS.matcher(emailText).matches() -> email.error = "Invalid email address"
                passwordText.isBlank() -> password.error = "Password is required"
                phoneText.isBlank() -> phone.error = "Phone number must be 10 digits"
                else -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    intent.putExtra("username", nameText)

                     startActivity(intent)
                }
            }
        }
    }
}
