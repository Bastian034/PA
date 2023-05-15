package com.example.hkbptarutung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ArrayAdapter
import com.example.hkbptarutung.app.ApiService
import com.example.hkbptarutung.app.Utils
import com.example.hkbptarutung.databinding.ActivityPendaftaranAkunBinding

class PendaftaranAkun : AppCompatActivity() {
    lateinit var binding: ActivityPendaftaranAkunBinding
    lateinit var mService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendaftaranAkunBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = getString(R.string.pendaftaranAkun)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        mService = Utils.getAPIService()

        ArrayAdapter.createFromResource(
            this, R.array.jenisKelamin, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.spJekel.adapter = adapter
        }
        binding.btnLanjut.setOnClickListener {
            Lanjut()
        }
    }

     fun Lanjut() {
        if (binding.edtUsername.text.isEmpty()) {
            binding.edtUsername.error = "Kolom Username tidak boleh kosong"
            binding.edtUsername.requestFocus()
            return
        } else if (binding.edtEmail.text.isEmpty()) {
            binding.edtEmail.error = "Kolom Email tidak boleh kosong"
            binding.edtEmail.requestFocus()
            return
        } else if (binding.edtWijk.text.isEmpty()) {
            binding.edtWijk.error = "Kolom Wijk tidak boleh kosong"
            binding.edtWijk.requestFocus()
            return
        } else if (binding.edtPassword.text.isEmpty()) {
            binding.edtPassword.error = "Kolom Password tidak boleh kosong"
            binding.edtPassword.requestFocus()
            return
        }else{
            register()
        }
        fun onOptionsItemSelected(item: MenuItem): Boolean {
            return when (item.itemId) {
                android.R.id.home -> {
                    onBackPressed()
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
        }

    }

    private fun register() {

    }
}