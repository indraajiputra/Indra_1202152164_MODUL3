package com.example.indrapro.indra_1202152164_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.txt_pwd);
        btnLogin = findViewById(R.id.signin);}
        //untuk berpindah layout an juga toast

        public void untukLogin(View view) {
        if (username.getText().toString().equalsIgnoreCase("EAD") && password.getText().toString().equalsIgnoreCase("MOBILE")){
            Toast.makeText(this, "anda berhasil login", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(login.this, com.example.indrapro.indra_1202152164_modul3.MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "username atau password anda salah", Toast.LENGTH_LONG).show();
        }
    }
}
