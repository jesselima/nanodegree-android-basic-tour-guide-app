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
import com.udacity.tourguide.adapters.PlaceAdapter;
import com.udacity.tourguide.models.Location;
import com.udacity.tourguide.models.Place;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class EatingFragment extends Fragment {


    public EatingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.list_view, container, false);


        final ArrayList<Place> places = new ArrayList<Place>();

        String jsonStr = null;
        // TODO: Check if getResources() instead use of getApplicationContext
        try {
            InputStream is = getContext().getAssets().open("eating.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsonStr = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            JSONObject jsonObj = new JSONObject(jsonStr);
            JSONArray placesJsonArray = jsonObj.getJSONArray("places");

            for (int i = 0; i < placesJsonArray.length(); i++) {

                JSONObject placeData = placesJsonArray.getJSONObject(i);

                String name = placeData.getString("name");
                String marker = placeData.getString("marker");

                JSONObject LatLng = placeData.getJSONObject("location");
                Double lat = LatLng.getDouble("lat");
                Double lng = LatLng.getDouble("lng");

                String openingHours = placeData.getString("opening_hours");

                Place data = new Place(name, marker, lat, lng, openingHours);

                places.add(data);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Double lat = places.get(position).getLat();
                Double lng = places.get(position).getLng();

                Intent intent = new Intent(getContext(), MapViewActivity.class);
                intent.putExtra("lat", lat);
                intent.putExtra("lng", lng);
                startActivity(intent);
            }
        });
        return rootView;

    }

}
