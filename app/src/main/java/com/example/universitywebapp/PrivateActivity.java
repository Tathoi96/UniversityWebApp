package com.example.universitywebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrivateActivity extends AppCompatActivity {
    Button btnIiuc,btnBrac,btnNsu,btnWub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);

        btnIiuc=findViewById(R.id.btn_iiuc);
        btnBrac=findViewById(R.id.btn_brac);
        btnNsu=findViewById(R.id.btn_nsu);
        btnWub=findViewById(R.id.btn_wub);


        btnIiuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateActivity.this,Web.class);
                intent.putExtra("url","www.iiuc.ac.bd");
                startActivity(intent);
            }
        });


        btnBrac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateActivity.this,Web.class);
                intent.putExtra("url","www.bracu.ac.bd");
                startActivity(intent);
            }
        });

        btnNsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateActivity.this,Web.class);
                intent.putExtra("url","www.northsouth.edu");
                startActivity(intent);
            }
        });

        btnWub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PrivateActivity.this,Web.class);
                intent.putExtra("url","www.wub.edu.bd");
                startActivity(intent);
            }
        });




    }
}