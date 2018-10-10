package com.example.povilas.customliview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

class customAdapter extends ArrayAdapter<String>{

    public customAdapter(@NonNull Context context, String[] resource) {

        super(context, R.layout.custom_layout, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.custom_layout, parent, false);
        String singleFoodItem = getItem(position);
        // to be completed
    }
}
