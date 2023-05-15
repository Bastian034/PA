package com.example.hkbptarutung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hkbptarutung.databinding.ActivityLoginPageBinding

class LoginPage : AppCompatActivity() {
    lateinit var binding: ActivityLoginPageBinding
    private var pressedTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, HomeJemaat::class.java))
            finish()
        }
        binding.btnTamu.setOnClickListener {
            startActivity(Intent(this, HomeTamu::class.java))
            finish()
        }
        binding.btnAdmin.setOnClickListener {
            Toast.makeText(this, "Fitur segera ditambahkan", Toast.LENGTH_SHORT).show()
        }
        binding.tvForgetpass.setOnClickListener {
            startActivity(Intent(this, LupaPassword::class.java))
        }

        binding.tvDaftar.setOnClickListener {
            startActivity(Intent(this, PendaftaranAkun::class.java))
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        if (pressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed()
        } else {
            Toast.makeText(this, "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show()
        }
        pressedTime = System.currentTimeMillis()
    }
}