package com.example.project1m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button15 = (Button) findViewById(R.id.button15);
        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main1Activity.this,MainActivity4.class);
                startActivity(intent);
            }
        };
        button15.setOnClickListener(clickListener1);

        Button button14 = (Button) findViewById(R.id.button14);
        View.OnClickListener clickListener = new  View.OnClickListener()
    {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main1Activity.this,Main1Activity2.class);
                startActivity(intent);
            }
        };
        button14.setOnClickListener(clickListener);
    }
}