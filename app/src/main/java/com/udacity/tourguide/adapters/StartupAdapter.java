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
        ViewHolder viewHolder;

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.startup_list_item, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.textViewName = convertView.findViewById(R.id.text_view_name);
            viewHolder.textViewIndustry = convertView.findViewById(R.id.text_view_industry);
            viewHolder.imageViewResourceId = convertView.findViewById(R.id.image_view_item_list);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Startup startup = getItem(position);
        viewHolder.textViewName.setText(startup.getName());
        viewHolder.textViewIndustry.setText(startup.getIndustry());
        viewHolder.imageViewResourceId.setImageResource(startup.getmImageResourceId());

        return convertView;
    }

    private class ViewHolder{
        private TextView textViewName;
        private TextView textViewIndustry;
        private ImageView imageViewResourceId;
    }
}