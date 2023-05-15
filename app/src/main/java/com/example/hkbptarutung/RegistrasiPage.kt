package com.example.hkbptarutung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import com.example.hkbptarutung.databinding.ActivityRegistrasiPageBinding

class RegistrasiPage : AppCompatActivity() {
    lateinit var binding: ActivityRegistrasiPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrasiPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.registrasiKegiatan)
        ArrayAdapter.createFromResource(
            this, R.array.registrasi_kegiatan, android.R.layout.simple_spinner_item
        ).also {
            adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spKegiatan.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this, R.array.jenisKelamin, android.R.layout.simple_spinner_item
        ).also {adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spJekel.adapter = adapter
        }

        binding.btnLanjut.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle(getString(R.string.registrasiKegiatan))
                setMessage("Registrasi kegiatan sudah ditambahkan, silahkan tunggu")
                setPositiveButton("Ya"){_, _ ->
                    onBackPressed()
                }
            }.create().show()
        }

        binding.btnBatal.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
    }
}