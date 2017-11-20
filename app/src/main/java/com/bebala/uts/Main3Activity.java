package com.bebala.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Hasil = (TextView) findViewById(R.id.TVW2);

        Intent intent = getIntent();

        String b = intent.getStringExtra("TVW2");


        Hasil.setText(b);
    }
}
