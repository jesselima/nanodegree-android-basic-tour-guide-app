package com.udacity.tourguide.adapters;


import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.udacity.tourguide.MapViewActivity;
import com.udacity.tourguide.R;
import com.udacity.tourguide.models.Place;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {


    public PlaceAdapter(Activity context, ArrayList<Place> places){
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_list_item, parent, false);

            Place currentPlace = getItem(position);

            TextView name = listItemView.findViewById(R.id.text_view_place_name);
            name.setText(currentPlace.getName());

            TextView marker = listItemView.findViewById(R.id.text_view_place_marker);
            marker.setText(currentPlace.getMarker());

            TextView openingHours = listItemView.findViewById(R.id.text_view_place_opening_hours);
            openingHours.setText(currentPlace.getOpeningHours());

        }

        return listItemView;
    }
}
