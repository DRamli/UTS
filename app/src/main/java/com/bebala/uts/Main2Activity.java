package com.bebala.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView Tampil;
    TextView Tampil2;
    EditText Edit;
    EditText Edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Tampil = (TextView)findViewById(R.id.TV1);
        Tampil2 = (TextView)findViewById(R.id.TV2);
        Edit = (EditText)findViewById(R.id.ET1);
        Edit2 = (EditText)findViewById(R.id.ET2);
    }

    public void button(View view) {
        try {
            Intent intent = new Intent(this,Main3Activity.class);
            intent.putExtra("TVW2","Hasil");
            startActivity(intent);
            int nilaiA = Integer.parseInt(Edit.getText().toString());
            int nilaiB = Integer.parseInt(Edit2.getText().toString());
            int hasil = nilaiA * nilaiB;
            Tampil.setText("" + hasil);


        }catch(Exception ex){
        }}

    public void button2(View view) {
        try {
            int nilaiA = Integer.parseInt(Edit.getText().toString());
            int nilaiB = Integer.parseInt(Edit2.getText().toString());
            int hasil = nilaiA + nilaiB;
            Tampil.setText("" + hasil);
        }catch(Exception ex){
        }
    }
}
