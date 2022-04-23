package com.example.fikri_muhamad_fauzi_10119117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// nim : 10119117
// nama : Fikri Muhamad Fauzi
// kelas : IF-3
// tanggal : 23 April 2022

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button TbBack    = findViewById(R.id.btnBack);
        TbBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBack:
                Intent pindahIntent11 = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(pindahIntent11);
                break;
        }
    }
}