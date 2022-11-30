package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ListView lvDMTG;
    private String[] tenTG = {"Huy Cận", "Mạc Ngôn", "Shakespeare", "Hemingway", "J.K. Rowling"};
    private String[] mota = {"Chính khách", "Nhà văn người Trung Quốc", "Nhà văn Anh", "Tiểu thuyết gia người Mỹ", "Nhà văn Anh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter itemsAdapter = new Adapter(this, tenTG, mota);

        lvDMTG = (ListView) findViewById(R.id.lv_dmtg);
        lvDMTG.setAdapter(itemsAdapter);

        lvDMTG.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent dmtp;
                switch (i){
                    case 1:
                        dmtp = new Intent(MainActivity.this, Dmtp_MN.class);
                        break;
                    case 2:
                        dmtp = new Intent(MainActivity.this, Dmtp_SP.class);
                        break;
                    case 3:
                        dmtp = new Intent(MainActivity.this, Dmtp_HW.class);
                        break;
                    case 4:
                        dmtp = new Intent(MainActivity.this, Dmtp_JR.class);
                        break;
                    default:
                        dmtp = new Intent(MainActivity.this, Dmtp_HC.class);
                        break;
                }
                startActivity(dmtp);
            }
        });
    }
}