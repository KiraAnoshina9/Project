package com.example.project1m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button rezultat = (Button) findViewById(R.id.rezultat);
        View.OnClickListener clickListener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(intent);
            }
        };
        rezultat.setOnClickListener(clickListener5);
    }
}