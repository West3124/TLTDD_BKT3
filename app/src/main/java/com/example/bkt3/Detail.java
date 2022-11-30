package com.example.bkt3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitiet);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tenTP = extras.getString("tenTP");
            TextView tv_tenTP = (TextView) findViewById(R.id.tv_tenTP);
            tv_tenTP.setText(tenTP);
            //The key argument here must match that used in the other activity
        }
    }
}
