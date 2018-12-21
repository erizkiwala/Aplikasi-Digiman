package com.example.asus.digiman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Projek extends AppCompatActivity {
    private ImageView back, tentang;
    private Button btnSubmit;
    private EditText nama , komen , nohp;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projek);
        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Projek.this, MainActivity.class);
                startActivity(intent);
            }
        });
        tentang = (ImageView) findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Projek.this , Tentang.class);
                startActivity(intent);
            }
        });

        nama = (EditText) findViewById(R.id.txtName);
        komen = (EditText) findViewById(R.id.txtKomen);
        nohp = (EditText) findViewById(R.id.txtnohp);

        btnSubmit = (Button) findViewById(R.id.btnSend);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Projek.this, Rincian.class);
                intent.putExtra("nama", nama.getText());
                intent.putExtra("Komentar" , komen.getText());
                intent.putExtra("No Hp", nohp.getText());
                startActivity(intent);
            }
        });
    }
}
