package com.example.preacticesharedpreferences.loacak.sharedpref

import android.content.Context

class SharedPreferences(private val context: Context) {
    val sharedPreferences = context.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE)

    fun saveDataName(data: String) {
        sharedPreferences.edit().putString(PUT_TV_NAME_KEY, data).apply()
    }

    fun getDataName(): String {
        val userName = sharedPreferences.getString(PUT_TV_NAME_KEY, null)
        return userName.toString()
    }

    companion object {
        const val PREF_KEY = "pref.key"
        const val PUT_TV_NAME_KEY = "put.tv.name.key"
    }
}