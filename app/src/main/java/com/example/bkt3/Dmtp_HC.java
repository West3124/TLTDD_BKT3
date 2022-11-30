package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Dmtp_HC extends AppCompatActivity {
    private ListView dmtp;
    private ArrayList<String> tp= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tp_hc_list);

        dmtp = (ListView) findViewById(R.id.lv_dmtp_hc);

        tp.add("Hai bàn tay em");
        tp.add("Phù Đổng Thiên Vương");
        tp.add("Cô gái Mèo");
        tp.add("Họp mặt thiếu niên anh hùng");
        tp.add("Sơn Tinh,Thủy Tinh");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Dmtp_HC.this, android.R.layout.simple_list_item_1, tp);

        dmtp.setAdapter(arrayAdapter);

        dmtp.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent detail = new Intent(Dmtp_HC.this, Detail.class);
            detail.putExtra("tenTP", String.valueOf(tp.get(i)));
            Dmtp_HC.this.startActivity(detail);
        });
    }
}
