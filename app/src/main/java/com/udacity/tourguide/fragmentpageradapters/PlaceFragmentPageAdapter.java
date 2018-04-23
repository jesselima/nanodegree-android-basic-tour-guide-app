package com.udacity.tourguide.fragmentpageradapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.udacity.tourguide.R;
import com.udacity.tourguide.fragments.EatingFragment;
import com.udacity.tourguide.fragments.SportsFragment;
import com.udacity.tourguide.fragments.StartupsFragment;
import com.udacity.tourguide.fragments.TourFragment;

/**
 * Created by jesse on 22/04/18.
 * This is a part of the project TourGuide.
 */
public class PlaceFragmentPageAdapter extends FragmentPagerAdapter{

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link PlaceFragmentPageAdapter} object.
     *
     * @param context is the context of the app
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public PlaceFragmentPageAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StartupsFragment();
        } else if (position == 1){
            return new EatingFragment();
        } else if (position == 2){
            return new SportsFragment();
        } else {
            return new TourFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.tab_tile_startups);
        } else if (position == 1){
            return  mContext.getString(R.string.tab_tile_eating);
        } else if (position == 2){
            return mContext.getString(R.string.tab_tile_sports);
        } else {
            return mContext.getString(R.string.tab_tile_tour);
        }
    }


}
