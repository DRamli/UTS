package com.bebala.uts;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemClickListener{

    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private String[] BangunRuang={
            "Persegi","Lingkaran","Segitiga","Pergegi Panjang","Trapesium"
    };
    private  Integer[] gbr= {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.ListBangun);
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,BangunRuang);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }





    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String message="("+((TextView)view).getText()+")";
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);

        intent.putExtra("message", message);
        startActivity(intent);
    }


}
