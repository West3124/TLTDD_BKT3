package com.example.bkt3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private String[] tenTG;
    private String[] mota;

    public Adapter(Activity activity, String[] tenTG, String[] mota) {
        this.activity = activity;
        this.tenTG = tenTG;
        this.mota = mota;
    }

    @Override
    public int getCount() {
        return tenTG.length;
    }

    @Override
    public Object getItem(int i) {
        return tenTG[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item, null);
        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        tvName.setText(tenTG[i]);
        TextView  tvDescription = (TextView) view.findViewById(R.id.tv_description);
        tvDescription.setText(mota[i]);
        return view;
    }
}