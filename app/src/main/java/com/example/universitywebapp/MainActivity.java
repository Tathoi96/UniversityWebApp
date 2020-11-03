package com.example.universitywebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPublic=findViewById(R.id.btn_public);
        Button btnPrivate=findViewById(R.id.btn_private);

        btnPublic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent university=new Intent(MainActivity.this,PublicActivity.class);
                startActivity(university);



                 Toast.makeText(MainActivity.this, "Public Universities", Toast.LENGTH_SHORT).show();
            }
        });






        btnPrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent university=new Intent(MainActivity.this,PrivateActivity.class);
                startActivity(university);


                Toast.makeText(MainActivity.this, "Private Universities", Toast.LENGTH_SHORT).show();

            }
        });


    }
}