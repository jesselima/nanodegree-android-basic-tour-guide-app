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
                "Google",
                "Google LLC is an American multinational technology company that specializes in Internet-related services and products, which include online advertising technologies, search engine, cloud computing, software and hardware",
                R.drawable.logo_google,
                37.4220041,
                -122.0862462,
                1998,
                "Larry Page, Sergey Brin",
                "www.google.com",
                "Internet, Software, Computer Hardware",
                "1600 Amphitheatre Pkwy, Mountain View, CA 94043, USA"));
        startups.add(new Startup(
                "Udacity",
                "Udacity is an e-learning platform that offers credential programs in artificial intelligence, machine learning, and robotics.",
                R.drawable.logo_udacity,
                37.3999172,
                -122.1105517,
                2011,
                "David Stavens, Mike Sokolsky, Sebastian Thrun",
                "www.udacity.com",
                "E-Learning, EdTech, Education, Internet",
                "2465 Latham St, Mountain View, CA 94040, USA"));

        startups.add(new Startup(
                "Linkedin",
                "LinkedIn is a business and employment-oriented service that operates via websites and mobile apps. It is mainly used for professional networking, including employers posting jobs and job seekers posting their CVs.",
                R.drawable.logo_linkedin,
                37.3926882,
                -122.0442225,
                2002,
                "Reid Hoffman",
                "www.linkedin.com",
                "Internet",
                "1000 W Maude Ave, Sunnyvale, CA 94085, USA"));
        startups.add(new Startup(
                "Elastic",
                "Elasticsearch is a search engine based on Lucene. It provides a distributed, multitenant-capable full-text search engine with an HTTP web interface and schema-free JSON documents.",
                R.drawable.logo_elastic,
                37.3864995,
                -122.0863176,
                2010,
                "Shay Banon",
                "www.elastic.co",
                "Search Engine",
                "800 W El Camino Real #350, Mountain View, CA 94040, USA"));
        startups.add(new Startup(
                "Upwork","Upwork, formerly Elance-oDesk, is a global freelancing platform where businesses and independent professionals connect and collaborate remotely.",
                R.drawable.logo_upwork,
                37.3981541,
                -122.0512789,
                2015,
                "Beerud Sheth and Srini Anumolu",
                "www.upwork.com",
                "Freelance marketplace",
                "441 Logue Ave, Mountain View, CA 94043, USA"));
        startups.add(new Startup(
                "Livongo",
                "Livongo is empowering people with chronic conditions to live a better life.",
                R.drawable.logo_livongo,
                37.3981541,
                -122.0512789,
                2014,
                "Kimon Angelides",
                "www.livongo.com",
                "Health Care, Health Diagnostics, Information Technology, Wellness",
                "441 Logue Ave, Mountain View, CA 94043, USA"));
        startups.add(new Startup(
                "Punchh",
                "Punchh offers digital marketing products combining AI and machine learning technologies.",
                R.drawable.logo_punchh,
                37.4065132,
                -122.1112712,
                2010,
                "Aditya Sanghi, Jitendra Gupta, Sastry Penumarthy, Shyam Rao",
                "www.punchh.com",
                "Digital Marketing",
                "201 San Antonio Cir #250, Mountain View, CA 94040, USA"));
        startups.add(new Startup(
                "Pure Storage",
                "Pure Storage is enterprise storage company for broad deployment of flash in data centers.",
                R.drawable.logo_pure_storage,
                37.3881372,
                -122.0851207,
                2009,
                "John Colgrove, John Hayes",
                "www.purestorage.com",
                "Cloud Computing, Data Storage, Enterprise Software",
                "650 Castro St #400, Mountain View, CA 94041, USA"));

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
                String address =       startups.get(position).getAddress();
                int imageResourceId =          startups.get(position).getmImageResourceId();

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
