package com.udacity.tourguide.adapters;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
        //View listItemView = convertView;
        ViewHolder holder;

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_list_item, parent, false);

            holder = new ViewHolder();

            holder.textViewName = convertView.findViewById(R.id.text_view_place_name);
            holder.textViewMarker = convertView.findViewById(R.id.text_view_place_marker);
            holder.textViewOpeningHours = convertView.findViewById(R.id.text_view_place_opening_hours);

            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Place place = getItem(position);

        holder.textViewName.setText(place.getName());
        holder.textViewMarker.setText(place.getMarker());
        holder.textViewOpeningHours.setText(place.getOpeningHours());

        return convertView;
    }

    private class ViewHolder{
        private TextView textViewName;
        private TextView textViewMarker;
        private TextView textViewOpeningHours;
    }
}
