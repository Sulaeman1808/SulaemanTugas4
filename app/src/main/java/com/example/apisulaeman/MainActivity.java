package com.example.apisulaeman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button java;
    Button c;
    Button js;
    Button py;
    Button dart;
    Button go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        java = (Button) findViewById(R.id.java);
        c = (Button) findViewById(R.id.c);
        js = (Button) findViewById(R.id.js);
        py = (Button) findViewById(R.id.py);
        dart = (Button) findViewById(R.id.dart);
        go = (Button) findViewById(R.id.go);


        java.setOnClickListener(this);
        c.setOnClickListener(this);
        js.setOnClickListener(this);
        py.setOnClickListener(this);
        dart.setOnClickListener(this);
        go.setOnClickListener(this);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IsiList.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IsiListC.class);
                startActivity(intent);
            }
        });
        js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IsiListJS.class);
                startActivity(intent);
            }
        });
        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IsiListPy.class);
                startActivity(intent);
            }
        });
        dart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IsiListDart.class);
                startActivity(intent);
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, IsiListGo.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {

    }
}