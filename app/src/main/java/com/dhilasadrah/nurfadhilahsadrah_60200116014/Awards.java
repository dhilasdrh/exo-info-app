package com.dhilasadrah.nurfadhilahsadrah_60200116014;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Awards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awards);

        getSupportActionBar().setTitle("AWARDS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
