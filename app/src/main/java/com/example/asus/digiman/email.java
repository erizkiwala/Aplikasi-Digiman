package com.example.asus.digiman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class email extends AppCompatActivity {
    private EditText eTo;
    private EditText eSubject;
    private EditText eMsg;
    private Button btn;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        eTo = (EditText)findViewById(R.id.txtTo);
        eSubject = (EditText)findViewById(R.id.txtSub);
        eMsg = (EditText)findViewById(R.id.txtMsg);
        btn = (Button)findViewById(R.id.btnsend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{eTo.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT,eSubject.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,eMsg.getText());
                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Choose Mail App"));
            }
        });

        back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent (email.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
