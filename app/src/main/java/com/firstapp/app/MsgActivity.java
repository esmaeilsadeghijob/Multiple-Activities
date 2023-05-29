package com.firstapp.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MsgActivity extends AppCompatActivity {

    ListView listView;
    String[] numbers = {"one", "two", "there", "four", "five"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
//1
        Intent intent = getIntent();
        String msg = intent.getStringExtra("FIRSTNAME");
//2
//        TextView textView = findViewById(R.id.txtView_2);
//        textView.setText("Hello  " + msg);
//
//        listView = (ListView) findViewById(R.id.list_view);

//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, numbers);
//        listView.setAdapter(adapter);


//        WebView webView = (WebView) findViewById(R.id.web);
//
//        webView.loadUrl("https://spring.io/");
//        webView.loadUrl("https://www.google.com/maps");





        TextView textView3 =  (TextView) findViewById(R.id.txtView_3);
        textView3.setText("firstName: Esmaeil" );

        TextView textView4 =  (TextView) findViewById(R.id.txtView_4);
        textView4.setText("lastName: Sadeghi");

        TextView textView5 =  (TextView) findViewById(R.id.txtView_5);
        textView5.setText("level: PHD");







    }
}