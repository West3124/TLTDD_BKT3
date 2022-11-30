package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Dmtp_MN extends AppCompatActivity {
    private ListView dmtp;
    private ArrayList<String> tp= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tp_mn_list);

        dmtp = (ListView) findViewById(R.id.lv_dmtp_mn);

        tp.add("Bước 13");
        tp.add("Dòng họ ăn cỏ");
        tp.add("Bức tường biết hát");
        tp.add("Cây tỏi nổi giận");
        tp.add("Củ cải đỏ trong suốt");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Dmtp_MN.this, android.R.layout.simple_list_item_1, tp);

        dmtp.setAdapter(arrayAdapter);

        dmtp.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent detail = new Intent(Dmtp_MN.this, Detail.class);
            detail.putExtra("tenTP", String.valueOf(tp.get(i)));
            Dmtp_MN.this.startActivity(detail);
        });
    }
}
