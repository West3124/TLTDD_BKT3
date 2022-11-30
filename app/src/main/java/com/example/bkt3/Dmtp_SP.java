package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Dmtp_SP extends AppCompatActivity {
    private ListView dmtp;
    private ArrayList<String> tp= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tp_sp_list);

        dmtp = (ListView) findViewById(R.id.lv_dmtp_sp);

        tp.add("The History of Cardenio");
        tp.add("Love's labour's wonne");
        tp.add("Giấc mộng đêm hè");
        tp.add("The Tragedy of Julius Caesar");
        tp.add("King of Britain");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Dmtp_SP.this, android.R.layout.simple_list_item_1, tp);

        dmtp.setAdapter(arrayAdapter);

        dmtp.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent detail = new Intent(Dmtp_SP.this, Detail.class);
            detail.putExtra("tenTP", String.valueOf(tp.get(i)));
            Dmtp_SP.this.startActivity(detail);
        });
    }
}
