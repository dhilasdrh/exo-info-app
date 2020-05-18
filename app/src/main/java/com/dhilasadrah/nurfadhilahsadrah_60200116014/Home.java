package com.dhilasadrah.nurfadhilahsadrah_60200116014;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btnProfil, btnDiscography, btnAwards, btnTours;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnProfil = (Button) findViewById(R.id.profil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent( Home.this, Profil.class);
                startActivity(in);
            }
        });

        btnAwards = (Button) findViewById(R.id.discography);
        btnAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent( Home.this, Discography.class);
                startActivity(in);
            }
        });

        btnAwards = (Button) findViewById(R.id.tours);
        btnAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent( Home.this, Tours.class);
                startActivity(in);
            }
        });

        btnAwards = (Button) findViewById(R.id.awards);
        btnAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent( Home.this, Awards.class);
                startActivity(in);
            }
        });


    }

}
