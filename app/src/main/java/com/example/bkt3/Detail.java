package com.example.bkt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
    private Button Back;
    private int idTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitiet);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tenTP = extras.getString("tenTP");
            TextView tv_tenTP = (TextView) findViewById(R.id.tv_tenTP);
            idTP = extras.getInt("idTP");
            tv_tenTP.setText(tenTP);
            //The key argument here must match that used in the other activity
        }

        Back = (Button) findViewById(R.id.btn_back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dmtp;
                switch (idTP){
                    case 1:
                        dmtp = new Intent(Detail.this, Dmtp_MN.class);
                        break;
                    case 2:
                        dmtp = new Intent(Detail.this, Dmtp_SP.class);
                        break;
                    case 3:
                        dmtp = new Intent(Detail.this, Dmtp_HW.class);
                        break;
                    case 4:
                        dmtp = new Intent(Detail.this, Dmtp_JR.class);
                        break;
                    default:
                        dmtp = new Intent(Detail.this, Dmtp_HC.class);
                        break;
                }
                startActivity(dmtp);
            }
        });
    }
}
