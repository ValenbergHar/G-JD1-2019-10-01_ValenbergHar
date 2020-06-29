package com.example.metro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MetroAdapter extends ArrayAdapter<String> {

    private List<String> stations;

    public MetroAdapter(@NonNull Context context, int resource, List<String> stations) {
        super(context, resource);
        this.stations = stations;
    }

    @Override
    public int getCount() {

        return stations.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView=inflater.inflate(R.layout.item, parent, false);
        String station= stations.get(position);
        TextView s = convertView.findViewById(R.id.station);
        s.setText(station);
        return convertView;
    }
}
