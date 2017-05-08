package com.example.jokerlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);
        TextView textView= (TextView) findViewById(R.id.joke);
        String joke=getIntent().getExtras().getString("joke");
        textView.setText(joke);
    }
}
