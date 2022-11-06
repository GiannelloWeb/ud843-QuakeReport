package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter (@NonNull Context context, @NonNull ArrayList<Earthquake> data){
        super(context,0,data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        Earthquake earthquake = getItem(position);
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        TextView magView = (TextView) listItemView.findViewById(R.id.mag_view);
        magView.setText(earthquake.getMag());
        TextView placeView = (TextView) listItemView.findViewById(R.id.place_view);
        placeView.setText(earthquake.getPlace());
        TextView timeView = (TextView) listItemView.findViewById((R.id.time_view));
        timeView.setText(earthquake.getTime());

        return listItemView;

    }
}
