package com.example.lesson_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class LaunchActivity extends AppCompatActivity {

    private static final String PREF_SHOWN = "isShown";

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        pref = getSharedPreferences("sharPref", MODE_PRIVATE);

        boolean isShown = pref.getBoolean(PREF_SHOWN, false);
        pref.edit().putBoolean(PREF_SHOWN, true).apply();
        if (!isShown) {
            startActivity(new Intent(this, IntroActivity.class));
        } else {
            MainActivity.start(this);
        }
        finish();
    }

}
