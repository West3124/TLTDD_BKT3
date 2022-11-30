package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Dmtp_HW extends AppCompatActivity {
    private ListView dmtp;
    private ArrayList<String> tp= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tp_hw_list);

        dmtp = (ListView) findViewById(R.id.lv_dmtp_hw);

        tp.add("A Farewell to Arms");
        tp.add("To Have and Have Not ");
        tp.add("For Whom the Bell Tolls ");
        tp.add("The Old Man and the Sea");
        tp.add("True at First Light");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Dmtp_HW.this, android.R.layout.simple_list_item_1, tp);

        dmtp.setAdapter(arrayAdapter);

        dmtp.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent detail = new Intent(Dmtp_HW.this, Detail.class);
            detail.putExtra("tenTP", String.valueOf(tp.get(i)));
            Dmtp_HW.this.startActivity(detail);
        });
    }
}
