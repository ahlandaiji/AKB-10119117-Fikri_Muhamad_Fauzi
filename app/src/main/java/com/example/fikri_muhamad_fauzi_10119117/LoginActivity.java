package com.example.fikri_muhamad_fauzi_10119117;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// nim : 10119117
// nama : Fikri Muhamad Fauzi
// kelas : IF-3
// tanggal : 23 April 2022

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView TbCreateAcc    = findViewById(R.id.txtRegister);
        Button BtnLogin             = findViewById(R.id.btnLogin);
        TbCreateAcc.setOnClickListener(this);
        BtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtRegister:
                Intent pindahIntent1 = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(pindahIntent1);
                break;
            case R.id.btnLogin:
                Intent pindahIntent2 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(pindahIntent2);
                break;
        }
    }

}