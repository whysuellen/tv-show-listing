package com.example.by

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.by.databinding.LoginactivityLayoutBinding

class LoginActivity : AppCompatActivity (){

    private lateinit var binding: LoginactivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginactivityLayoutBinding.inflate(this.layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.loginButton.setOnClickListener {
            if (binding.loginEditText.text.toString() == ownerName && binding.passwordEditText.toString() == ownerPassword) {
                Toast.makeText(this, "Login e senha vákidos!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, TVShowListing2Activity::class.java)
                intent.putExtra(Keys.titleSecondActivityKey, "Séries favoritas!")

                startActivity(intent)
            } else {
                Toast.makeText(this, "Login e senha inválidos!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private companion object {
        const val ownerName = "Su"
        const val ownerPassword = "1234"
    }
}