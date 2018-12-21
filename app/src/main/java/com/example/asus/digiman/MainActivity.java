package com.example.asus.digiman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView gb1, gb2, gb3, gb4 ,gb5 ,gb6 ,gb7, gb8 , projek , login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb1 = (ImageView) findViewById(R.id.gambar1);
        gb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Gambar1.class);
                startActivity(intent);
            }
        });
        gb2 = (ImageView) findViewById(R.id.gambar2);
        gb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Gambar2.class);
                startActivity(intent);
            }
        });

        gb3 = (ImageView) findViewById(R.id.gambar3);
        gb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Gambar3.class);
                startActivity(intent);
            }
        });

        gb4 = (ImageView) findViewById(R.id.gambar4);
        gb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Gambar4.class);
                startActivity(intent);
            }
        });

        gb5 = (ImageView) findViewById(R.id.gambar5);
        gb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Gambar5.class);
                startActivity(intent);
            }
        });

        gb6 = (ImageView) findViewById(R.id.gambar6);
        gb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Gambar6.class);
                startActivity(intent);
            }
        });
        gb7 = (ImageView) findViewById(R.id.gambar7);
        gb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Gambar7.class);
                startActivity(intent);
            }
        });
        gb8 = (ImageView) findViewById(R.id.gambar7);
        gb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Gambar8.class);
                startActivity(intent);
            }
        });
        projek = (ImageView) findViewById(R.id.prjk);
        projek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Projek.class);
                startActivity(intent);
            }
        });
        login = (ImageView) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
