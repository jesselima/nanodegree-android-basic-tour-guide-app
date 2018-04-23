package com.udacity.tourguide.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.udacity.tourguide.MapViewActivity;
import com.udacity.tourguide.R;
import com.udacity.tourguide.StartupDetailsActivity;
import com.udacity.tourguide.adapters.StartupAdapter;
import com.udacity.tourguide.models.Startup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartupsFragment extends Fragment {


    public StartupsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView =  inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Startup> startups = new ArrayList<Startup>();
        startups.add(new Startup("Livongo","Livongo is empowering people with chronic conditions to live a better life.", R.drawable.livongo, 37.3924295, -122.0740734));
        startups.add(new Startup("Punchh","Punchh offers digital marketing products combining AI and machine learning technologies.", R.drawable.punchh, 37.4065132,-122.1112765));
        startups.add(new Startup("Pure Storage","Pure Storage is enterprise storage company for broad deployment of flash in data centers.", R.drawable.pure_storage, 37.3881372,-122.085126));

        StartupAdapter adapter = new StartupAdapter(getActivity(), startups, R.id.image_view_item_list);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Double lat = startups.get(position).getLat();
                Double lng = startups.get(position).getLng();

                Intent intent = new Intent(getContext(), MapViewActivity.class);
                    intent.putExtra("lat", lat);
                    intent.putExtra("lng", lng);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
