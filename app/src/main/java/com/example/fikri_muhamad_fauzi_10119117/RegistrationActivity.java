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

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button TbRegist    = findViewById(R.id.btnRegister);
        TbRegist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRegister:
                Intent pindahIntent11 = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(pindahIntent11);
                break;
        }
    }
}