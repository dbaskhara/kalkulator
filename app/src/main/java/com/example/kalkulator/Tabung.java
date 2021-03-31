package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tabung extends AppCompatActivity {

    private Button btn_kembali,btn_hasil;
    private EditText jarijari , tinggi , pi , hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabung);
        btn_kembali = findViewById(R.id.btn_kembali);
        btn_hasil = findViewById(R.id.btn_hasil);
        jarijari = findViewById(R.id.jarijari);
        tinggi = findViewById(R.id.tinggi);
        pi = findViewById(R.id.pi);
        hasil = findViewById(R.id.hasil);
        pi.setText("22/7");
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
                if (TextUtils.isEmpty(jarijari.getText().toString())||TextUtils.isEmpty(tinggi.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please Enter Value!",Toast.LENGTH_SHORT).show();
                }
                else{
                    int jarijari_int = Integer.parseInt(jarijari.getText().toString());
                    int tinggi_int = Integer.parseInt(tinggi.getText().toString());
                    int hasil_int = (jarijari_int * jarijari_int * tinggi_int * 22) / 7;
                    String hasil_string = String.valueOf(hasil_int);
                    hasil.setText(hasil_string);
                }
            }
        });
    }
}