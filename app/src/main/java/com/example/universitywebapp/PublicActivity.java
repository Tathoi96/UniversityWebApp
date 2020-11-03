package com.example.universitywebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PublicActivity extends AppCompatActivity {

    Button btnCuet,btnBuet,btnCu,btnDu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);

         btnCuet=findViewById(R.id.btn_cuet);
         btnBuet=findViewById(R.id.btn_buet);
         btnCu=findViewById(R.id.btn_cu);
         btnDu=findViewById(R.id.btn_du);


         btnCuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PublicActivity.this,Web.class);
                intent.putExtra("url","www.cuet.ac.bd");
                startActivity(intent);
            }
        });


        btnBuet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PublicActivity.this,Web.class);
                intent.putExtra("url","www.buet.ac.bd");
                startActivity(intent);
            }
        });

        btnCu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PublicActivity.this,Web.class);
                intent.putExtra("url","www.cu.ac.bd");
                startActivity(intent);
            }
        });




        btnDu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PublicActivity.this,Web.class);
                intent.putExtra("url","www.du.ac.bd");
                startActivity(intent);
            }
        });



    }
}