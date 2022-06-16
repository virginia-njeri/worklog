package com.clarissa22.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var tvSignup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



views()
    }

    fun validateLogin() {
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        if (email.isBlank()) {
            tilEmail.error = "Email is invalid"
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            tilEmail.error = "Email is invalid"

        }
        if (password.isBlank()) {
            tilPassword.error = "Password required"
        }


    }

    fun views() {
        btnLogin = findViewById(R.id.btnLogin)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        tvSignup = findViewById(R.id.tvSignup)

        btnLogin.setOnClickListener {
            validateLogin()
            startActivity(Intent(this, HomeActivity::class.java))
        }

        tvSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

}

         //        tilEmail.error =
//        tilPassword.error = null
//        var email = etEmail.text.toString()
//        if (email.isBlank()) {
//            tilEmail.error = "Email is required"
//            error = true
//        }
//        var password = etPassword.text.toString()
//        if (password.isBlank()) {
//            tilPassword.error = "Password is required"
//            error = true
//        }
//        if (!error) {
//        }
//    }
//}








