package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kubus extends AppCompatActivity {

    private Button btn_kembali,btn_hasil;
    private EditText sisi,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);
        btn_kembali = findViewById(R.id.btn_kembali);
        btn_hasil = findViewById(R.id.btn_hasil);
        sisi = findViewById(R.id.sisi);
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
                if (TextUtils.isEmpty(sisi.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please Enter Value!",Toast.LENGTH_SHORT).show();
                }
                else{
                    int sisi_int = Integer.parseInt(sisi.getText().toString());
                    int hasil_int = sisi_int * sisi_int * sisi_int;
                    String hasil_string = String.valueOf(hasil_int);
                    hasil.setText(hasil_string);
                }
            }
        });
    }
}