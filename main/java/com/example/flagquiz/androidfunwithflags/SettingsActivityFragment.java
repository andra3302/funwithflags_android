package com.example.flagquiz.androidfunwithflags;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import androidx.annotation.Nullable;
import com.example.flagquiz.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class SettingsActivityFragment extends PreferenceFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
