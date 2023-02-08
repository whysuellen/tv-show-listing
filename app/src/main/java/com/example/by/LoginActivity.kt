package com.example.by

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.by.databinding.LoginactivityLayoutBinding

class LoginActivity : AppCompatActivity(){

    private lateinit var binding: LoginactivityLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginactivityLayoutBinding.inflate(this.layoutInflater)
        setContentView(binding.root)
        setupView()
    }

    private fun setupView() {
        binding.loginButton.setOnClickListener {
            val ownerNameMatches = binding.loginEditText.text.toString() == ownerName
            val passwordMatches = binding.passwordEditText.text.toString() == ownerPassword

            if (ownerNameMatches && passwordMatches) {
                Toast.makeText(this, "Login e senha vákidos!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, TVShowListingActivity::class.java)
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