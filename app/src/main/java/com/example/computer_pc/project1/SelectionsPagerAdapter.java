package com.example.computer_pc.project1;

/**
 * Created by willyko on 2016-11-28.
 */

/**
 * A selection fragment containing a simple view.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 *
 * TODO: Add looping to the pager adapter
 */
public class SelectionsPagerAdapter extends FragmentPagerAdapter {

    static final int NUM_ITEMS = 8;
    private final FragmentManager mFragmentManager;
    private Fragment mFragmentAtPos0;

    SelectionsPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragmentManager = fm;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantia te the fragment for the given page.
        // Return a SelectionFragment.

        if (position == 0) {
            return StatusFragment.newInstance();
        } else {
            return SelectionFragment.newInstance(position);
        }
    }

    @Override
    public int getCount() {
        //TODO: move the magic number somewhere else
        // Show 8 total pages.
        return NUM_ITEMS;
    }

}
