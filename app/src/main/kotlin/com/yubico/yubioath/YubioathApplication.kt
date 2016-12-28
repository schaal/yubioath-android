package com.yubico.yubioath

import android.app.Application
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatDelegate

/**
 * Created by daniel on 28.12.16.
 */

class YubioathApplication : Application() {
    companion object {
        const val PREF_DAY_NIGHT_MODE = "pref_day_night_mode"
    }

    override fun onCreate() {
        super.onCreate()
        val day_night_mode = PreferenceManager.getDefaultSharedPreferences(this).getInt(PREF_DAY_NIGHT_MODE, AppCompatDelegate.MODE_NIGHT_YES)
        AppCompatDelegate.setDefaultNightMode(day_night_mode)
    }
}