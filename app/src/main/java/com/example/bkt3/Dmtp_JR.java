package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Dmtp_JR extends AppCompatActivity {
    private ListView dmtp;
    private ArrayList<String> tp= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tp_jr_list);

        dmtp = (ListView) findViewById(R.id.lv_dmtp_jr);

        tp.add("The Ickabog");
        tp.add("The Christmas Pig");
        tp.add("Harry Potter và Chiếc cốc lửa");
        tp.add("Harry Potter và Hội Phượng Hoàng");
        tp.add("Harry Potter và Hoàng tử lai");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Dmtp_JR.this, android.R.layout.simple_list_item_1, tp);

        dmtp.setAdapter(arrayAdapter);

        dmtp.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent detail = new Intent(Dmtp_JR.this, Detail.class);
            detail.putExtra("tenTP", String.valueOf(tp.get(i)));
            detail.putExtra("idTP", 4);
            Dmtp_JR.this.startActivity(detail);
        });
    }
}
