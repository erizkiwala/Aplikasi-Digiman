package com.example.asus.digiman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gambar3 extends AppCompatActivity {
    private ImageView back , tentang, telepon , email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar3);
        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gambar3.this, MainActivity.class);
                startActivity(intent);
            }
        });
        tentang = (ImageView) findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gambar3.this , Tentang.class);
                startActivity(intent);
            }
        });

        email = (ImageView) findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gambar3.this, email.class);
                startActivity(intent);
            }
        });
        telepon = (ImageView) findViewById(R.id.telepon);
        telepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Gambar3.this, Telepon.class);
                startActivity(intent);
            }
        });
    }
}
