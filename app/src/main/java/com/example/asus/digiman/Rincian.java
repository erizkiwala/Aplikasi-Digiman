package com.example.asus.digiman;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Rincian extends AppCompatActivity {
    private ImageView back, tentang;
    private Button proses;
    String nama , komen , nohp;
    TextView nama1 , komen1 , nohp1;
    private DatabaseReference tempatRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian);
        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rincian.this, Projek.class);
                startActivity(intent);
            }
        });
        tentang = (ImageView) findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rincian.this , Tentang.class);
                startActivity(intent);
            }
        });

        tempatRef = FirebaseDatabase.getInstance().getReference().child("Projek");

        nama1 = findViewById(R.id.nama);
        komen1 = findViewById(R.id.komen);
        nohp1 = findViewById(R.id.nohp);

        nama = getIntent().getExtras().get("nama").toString();
        komen = getIntent().getExtras().get("Komentar").toString();
        nohp = getIntent().getExtras().get("No Hp").toString();

        nama1.setText(nama);
        komen1.setText(komen);
        nohp1.setText(nohp);

        proses = (Button) findViewById(R.id.proses);
        proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    saveProjek();
            }
        });
    }
    private void saveProjek(){
        String nama = nama1.getText().toString();
        String komen = komen1.getText().toString();
        String nohp = nohp1.getText().toString();
        final String tmp_key = tempatRef.push().getKey();
        final HashMap projekmap = new HashMap();
        projekmap.put("No Hp", nohp);
        projekmap.put("Nama",nama);
        projekmap.put("Komen", komen);

        tempatRef.child(tmp_key).updateChildren(projekmap)
                .addOnCompleteListener(new OnCompleteListener() {
                    @Override
                    public void onComplete(@NonNull Task task) {
                        if (task.isSuccessful()){
                            Toast.makeText(Rincian.this, "Berhasil Disimpan", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Rincian.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }
                });


    }
    }

