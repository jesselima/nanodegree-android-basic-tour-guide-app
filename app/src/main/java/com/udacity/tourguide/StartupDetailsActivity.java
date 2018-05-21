package com.udacity.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StartupDetailsActivity extends AppCompatActivity {

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

        // Get the id of root ViewGroup at the item_startup_details.xml and update its child views.
        updateUiReusingLayouts(R.id.name, R.string.name ,name);
        updateUiReusingLayouts(R.id.industry, R.string.industry , industry);
        updateUiReusingLayouts(R.id.founded, R.string.founded ,String.valueOf(founded));
        updateUiReusingLayouts(R.id.founders, R.string.founders ,founders);

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

        TextView startupAddress = findViewById(R.id.text_view_address);
        startupAddress.setText(address);

        TextView startupDescription = findViewById(R.id.text_view_description);
        startupDescription.setText(description);

        ImageView startupLogo = findViewById(R.id.image_view_logo);
        startupLogo.setImageResource(imageResourceId);

    }

    public void updateUiReusingLayouts(int resourceIdViewGroup, int resourceIdlabel, String text){

        View line = findViewById(resourceIdViewGroup);

        TextView lineLabel = line.findViewById(R.id.text_view_label);
        lineLabel.setText(resourceIdlabel);

        TextView lineData = line.findViewById(R.id.text_view_data);
        lineData.setText(text);
    }
}
