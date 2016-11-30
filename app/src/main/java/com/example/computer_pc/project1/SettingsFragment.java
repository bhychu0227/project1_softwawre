package com.example.computer_pc.project1;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
/**
 * A {@link PreferenceFragmentCompat} that presents a set of application settings. On
 * handset devices, settings are presented as a single list. On tablets,
 * settings are split by category, with category headers shown to the left of
 * the list of settings.
 * <p>
 * See <a href="http://developer.android.com/design/patterns/settings.html">
 * Android Design: Settings</a> for design guidelines and the <a
 * href="http://developer.android.com/guide/topics/ui/settings.html">Settings
 * API Guide</a> for more information on developing a Settings UI.
 */
public class SettingsFragment extends PreferenceFragmentCompat {
    final String LOG_TAG = SettingsFragment.class.getSimpleName();

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        //super.onCreate(savedInstanceState);
/*
        //String settings = getArguments().getString("settings");
        if ("notifications".equals(settings)) {
            addPreferencesFromResource(R.xml.pref_scansetting);
        } else {
        //} else if ("sync".equals(settings)) {
            addPreferencesFromResource(R.xml.pref_videosetting);
        }
*/
        setPreferencesFromResource(R.xml.pref_videosetting, rootKey);
    }
}
