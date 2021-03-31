package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bola extends AppCompatActivity {

    private Button btn_kembali,btn_hasil;
    private EditText jarijari , konstanta , pi , hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bola);
        btn_kembali = findViewById(R.id.btn_kembali);
        btn_hasil = findViewById(R.id.btn_hasil);
        jarijari = findViewById(R.id.jarijari);
        konstanta = findViewById(R.id.konstanta);
        pi = findViewById(R.id.pi);
        hasil = findViewById(R.id.hasil);
        konstanta.setText("4/3");
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
                if (TextUtils.isEmpty(jarijari.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Please Enter Value!",Toast.LENGTH_SHORT).show();
                }
                else{
                    int jarijari_int = Integer.parseInt(jarijari.getText().toString());
                    int hasil_int = (jarijari_int * jarijari_int * jarijari_int * 4 * 22) / (7 * 3);
                    String hasil_string = String.valueOf(hasil_int);
                    hasil.setText(hasil_string);
                }
            }
        });
    }
}