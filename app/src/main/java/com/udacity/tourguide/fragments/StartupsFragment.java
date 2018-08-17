package com.udacity.tourguide.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

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
        startups.add(new Startup(
                getString(R.string.name_google),
                getString(R.string.description_google),
                R.drawable.logo_google,
                37.4220041,
                -122.0862462,
                1998,
                getString(R.string.founders_google),
                getString(R.string.site_google),
                getString(R.string.industry_google),
                getString(R.string.address_google)));
        startups.add(new Startup(
                getString(R.string.name_udacity),
                getString(R.string.description_udacity),
                R.drawable.logo_udacity,
                37.3999172,
                -122.1105517,
                2011,
                getString(R.string.founders_udacity),
                getString(R.string.site_udacity),
                getString(R.string.industry_udacity),
                getString(R.string.address_udacity)));

        startups.add(new Startup(
                getString(R.string.name_linkedin),
                getString(R.string.description_linkedin),
                R.drawable.logo_linkedin,
                37.3926882,
                -122.0442225,
                2002,
                getString(R.string.founders_linkedin),
                getString(R.string.site_linkedin),
                getString(R.string.industry_linkedin),
                getString(R.string.address_linkedin)));
        startups.add(new Startup(
                getString(R.string.name_elastic),
                getString(R.string.description_elastic),
                R.drawable.logo_elastic,
                37.3864995,
                -122.0863176,
                2010,
                getString(R.string.founders_elastic),
                getString(R.string.site_elastic),
                getString(R.string.industry_linkedin),
                getString(R.string.address_elastic)));
        startups.add(new Startup(
                getString(R.string.name_upwork),
                getString(R.string.description_upwork),
                R.drawable.logo_upwork,
                37.3981541,
                -122.0512789,
                2015,
                getString(R.string.founders_upwork),
                getString(R.string.site_upwork),
                getString(R.string.industry_upwork),
                getString(R.string.address_upwork)));
        startups.add(new Startup(
                getString(R.string.name_livongo),
                getString(R.string.description_livongo),
                R.drawable.logo_livongo,
                37.3981541,
                -122.0512789,
                2014,
                getString(R.string.founders_livongo),
                getString(R.string.site_livongo),
                getString(R.string.industry_livongo),
                getString(R.string.address_livongo)));
        startups.add(new Startup(
                getString(R.string.name_punchh),
                getString(R.string.description_punchh),
                R.drawable.logo_punchh,
                37.4065132,
                -122.1112712,
                2010,
                getString(R.string.founders_punchh),
                getString(R.string.site_punchh),
                getString(R.string.industry_punchh),
                getString(R.string.address_punchh)));
        startups.add(new Startup(
                getString(R.string.name_pure_storage),
                getString(R.string.description_pure_storage),
                R.drawable.logo_pure_storage,
                37.3881372,
                -122.0851207,
                2009,
                getString(R.string.founders_pure_storage),
                getString(R.string.site_pure_storage),
                getString(R.string.industry_pure_storage),
                getString(R.string.address_pure_storage)));

        StartupAdapter adapter = new StartupAdapter(getActivity(), startups, R.id.image_view_item_list);
        ListView listView = rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String name =           startups.get(position).getName();
                String description =    startups.get(position).getDescription();
                Double lat =            startups.get(position).getLat();
                Double lng =            startups.get(position).getLng();
                int founded =           startups.get(position).getFounded();
                String founders =       startups.get(position).getFounders();
                String site =           startups.get(position).getSite();
                String industry =       startups.get(position).getIndustry();
                String address =        startups.get(position).getAddress();
                int imageResourceId =   startups.get(position).getmImageResourceId();

                Intent intent = new Intent(getContext(), StartupDetailsActivity.class);
                    intent.putExtra("name", name);
                    intent.putExtra("description", description);
                    intent.putExtra("lat", lat);
                    intent.putExtra("lng", lng);
                    intent.putExtra("founded", founded);
                    intent.putExtra("founders", founders);
                    intent.putExtra("site", site);
                    intent.putExtra("industry", industry);
                    intent.putExtra("address", address);
                    intent.putExtra("imageResourceId", imageResourceId);
                startActivity(intent);
            }
        });
        return rootView;
    }
}