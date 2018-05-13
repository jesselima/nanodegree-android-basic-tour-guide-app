package com.udacity.tourguide.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udacity.tourguide.R;
import com.udacity.tourguide.models.Startup;

import java.util.ArrayList;

public class StartupAdapter extends ArrayAdapter<Startup> {

    private int mImageResourceId;

    public StartupAdapter(Activity context, ArrayList<Startup> startups, int imageResourceId){
        super(context, 0, startups);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.startup_list_item, parent, false);

            Startup currentStartup = getItem(position);

            TextView name = listItemView.findViewById(R.id.text_view_name);
            name.setText(currentStartup.getName());

            TextView industry = listItemView.findViewById(R.id.text_view_industry);
            industry.setText(currentStartup.getIndustry());

            ImageView imageView = listItemView.findViewById(R.id.image_view_item_list);
            imageView.setImageResource(currentStartup.getmImageResourceId());
        }
        return listItemView;
    }
}