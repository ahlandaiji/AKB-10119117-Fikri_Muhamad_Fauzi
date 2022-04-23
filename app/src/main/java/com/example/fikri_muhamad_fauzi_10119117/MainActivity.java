package com.example.fikri_muhamad_fauzi_10119117;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

// nim : 10119117
// nama : Fikri Muhamad Fauzi
// kelas : IF-3
// tanggal : 23 April 2022

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button TbLogout    = findViewById(R.id.btnLogout);
        Button TbProfile   = findViewById(R.id.btnProf);
        TbLogout.setOnClickListener(this);
        TbProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogout:
                Intent pindahIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(pindahIntent);
                break;
            case R.id.btnProf:
                Intent pindahIntent2 = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(pindahIntent2);
                break;
        }
    }
}

















