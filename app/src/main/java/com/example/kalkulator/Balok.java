package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Balok extends AppCompatActivity {

    private Button btn_kembali,btn_hasil;
    private EditText panjang,tinggi,lebar,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balok);
        btn_kembali = findViewById(R.id.btn_kembali);
        btn_hasil = findViewById(R.id.btn_hasil);
        panjang = findViewById(R.id.panjang);
        tinggi = findViewById(R.id.tinggi);
        lebar = findViewById(R.id.lebar);
        hasil = findViewById(R.id.hasil);
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(getApplicationContext() , MainActivity.class);
                startActivity(kembali);
            }
        });
        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(panjang.getText().toString())||TextUtils.isEmpty(tinggi.getText().toString())||TextUtils.isEmpty(lebar.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please Enter Value!",Toast.LENGTH_SHORT).show();
                }
                else{
                    int panjang_int = Integer.parseInt(panjang.getText().toString());
                    int tinggi_int = Integer.parseInt(tinggi.getText().toString());
                    int lebar_int = Integer.parseInt(lebar.getText().toString());
                    int hasil_int = panjang_int * tinggi_int * lebar_int;
                    String hasil_string = String.valueOf(hasil_int);
                    hasil.setText(hasil_string);
                }
            }
        });
    }
}