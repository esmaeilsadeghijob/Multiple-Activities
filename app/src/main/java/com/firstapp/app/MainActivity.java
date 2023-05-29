package com.firstapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msgView(View view) {
        EditText myText = (EditText) findViewById(R.id.txtView_1);
        String firstName = myText.getText().toString();

        Intent intent = new Intent(this, MsgActivity.class);

        intent.putExtra("FIRSTNAME", firstName);
        startActivity(intent);
    }
}