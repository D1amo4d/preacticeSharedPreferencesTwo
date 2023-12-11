package com.example.preacticesharedpreferences

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.preacticesharedpreferences.databinding.ActivityMainBinding
import com.example.preacticesharedpreferences.loacak.sharedpref.SharedPreferences

class MainActivity : AppCompatActivity() {
    private lateinit var pref: SharedPreferences

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pref = SharedPreferences(this)
        loadData()

        binding.btnSend.setOnClickListener {
            val etUserName = binding.etDataNaem.text.toString()
            pref.saveDataName(etUserName)
        }
    }

    private fun loadData() {
        val getUserNameData = pref.getDataName()
        binding.tvUserName.text = getUserNameData
    }
}