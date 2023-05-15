package com.example.hkbptarutung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import com.example.hkbptarutung.databinding.ActivityHomeJemaatBinding

class HomeJemaat : AppCompatActivity() {
    lateinit var binding: ActivityHomeJemaatBinding
    private var pressedTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeJemaatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.cvHistory.setOnClickListener {
            startActivity(Intent(this, HistoryPage::class.java))
        }

        binding.cvAcaraMinggu.setOnClickListener {
            startActivity(Intent(this, AcaraMinggu::class.java))
        }

        binding.cvWartaJemaat.setOnClickListener {
            startActivity(Intent(this, WartaJemaat::class.java))
        }

        binding.cvRegistrasi.setOnClickListener {
            startActivity(Intent(this, RegistrasiPage::class.java))
        }

        binding.ivProfile.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed()
        } else {
            Toast.makeText(this, "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show()
        }
        pressedTime = System.currentTimeMillis()
    }
}