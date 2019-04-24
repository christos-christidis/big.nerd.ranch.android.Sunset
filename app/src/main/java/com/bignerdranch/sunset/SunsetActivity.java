package com.bignerdranch.sunset;

import android.support.v4.app.Fragment;

public class SunsetActivity extends SingleFragmentActivity {

    @Override
    Fragment createFragment() {
        return SunsetFragment.newInstance();
    }
}
