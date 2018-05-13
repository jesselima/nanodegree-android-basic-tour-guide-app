package com.udacity.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StartupDetailsActivity extends AppCompatActivity {

//    private String name;
//    private String description;
//    private int founded;
//    private String founders;
//    private String site;
//    private String industry;
//    private String address;
//    private Double lat;
//    private Double lng;
//    private int imageResourceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup_details);

        Bundle locationData = getIntent().getExtras();
        String name = locationData.getString("name");
        String description = locationData.getString("description");
        int founded = locationData.getInt("founded");
        String founders = locationData.getString("founders");
        String site = locationData.getString("site");
        String industry = locationData.getString("industry");
        String address = locationData.getString("address");
        final Double lat = locationData.getDouble("lat");
        final Double lng = locationData.getDouble("lng");
        int imageResourceId = locationData.getInt("imageResourceId");

        LinearLayout linearLayoutLocation = findViewById(R.id.location);
        linearLayoutLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapViewActivity.class);
                    intent.putExtra("lat", lat);
                    intent.putExtra("lng", lng);
                startActivity(intent);
            }
        });

        updateUi(name, description, founded, founders, site, industry, address, imageResourceId);
    }

    public void updateUi(
                String name,
                String description,
                int founded,
                String founders,
                final String site,
                String industry,
                String address,
                int imageResourceId){

        TextView startupName = findViewById(R.id.text_view_name);
        startupName.setText(name);

        TextView startupFounded = findViewById(R.id.text_view_founded);
        startupFounded.setText(String.valueOf(founded));

        TextView startupFounders = findViewById(R.id.text_view_founders);
        startupFounders.setText(founders);

        TextView startupSite = findViewById(R.id.text_view_site);
        startupSite.setText(site);
        startupSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri siteUri = Uri.parse(String.valueOf("http://" + site));
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, siteUri);
                startActivity(websiteIntent);
            }
        });

        TextView startupIndustry = findViewById(R.id.text_view_industry);
        startupIndustry.setText(industry);

        TextView startupAddress = findViewById(R.id.text_view_address);
        startupAddress.setText(address);

        TextView startupDescription = findViewById(R.id.text_view_description);
        startupDescription.setText(description);

        ImageView startupLogo = findViewById(R.id.image_view_logo);
        startupLogo.setImageResource(imageResourceId);

    }
}
