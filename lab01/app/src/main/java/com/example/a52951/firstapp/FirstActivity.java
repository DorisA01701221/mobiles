package com.example.a52951.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button btnNewAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnNewAct = findViewById(R.id.button);
        btnNewAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(FirstActivity.this, TargetActivity.class);
                    myIntent.putExtra("stringToSend", "hello intent");
                    myIntent.putExtra("myInteger", 2);
                        startActivity(myIntent);
            }
        });
    }
}
