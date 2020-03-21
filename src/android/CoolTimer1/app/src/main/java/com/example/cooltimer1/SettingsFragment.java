package com.example.cooltimer1;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import java.util.prefs.PreferenceChangeEvent;

import androidx.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.timer_preference);
    }
}
