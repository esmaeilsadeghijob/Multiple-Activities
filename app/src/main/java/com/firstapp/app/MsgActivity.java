package com.firstapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MsgActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
//1
        Intent intent = getIntent();
        String msg = intent.getStringExtra("FIRSTNAME");
//2
        TextView textView = findViewById(R.id.txtView_2);
        textView.setText("Hello  " + msg);
    }
}