package com.example.saints;


import android.content.Context;


import android.util.Log;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;

import android.widget.TextView;


import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SaintAdapter extends ArrayAdapter<Saint> {

    private List<Saint> saints;

    public SaintAdapter(@NonNull Context context, int resource, List<Saint> saints) {
        super(context, resource);
        this.saints = saints;
    }

    @Override
    public int getCount() {
        return saints.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Saint s = saints.get(position);
        Holder holder = null;

        if(convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.listviewitem, parent, false);
            holder = new Holder();

            holder.name = (TextView) convertView.findViewById(R.id.text);
            holder.dob = (TextView) convertView.findViewById(R.id.dob);
            holder.dod = (TextView) convertView.findViewById(R.id.dod);
            holder.rating = (RatingBar) convertView.findViewById(R.id.rating);
            holder.three = (ImageView) convertView.findViewById(R.id.threedots);

            convertView.setTag(holder);

            Log.d("happy", "inflater.inflate");
        }
        holder = (Holder) convertView.getTag();

        holder.name.setText(s.getName());
        holder.dob.setText(s.getDob());
        holder.dod.setText(s.getDod());
        holder.rating.setRating(s.getRating());

        return convertView;
    }

    private static class Holder {
        TextView name;
        TextView dob;
        TextView dod;
        RatingBar rating;
        ImageView three;
    }
}
