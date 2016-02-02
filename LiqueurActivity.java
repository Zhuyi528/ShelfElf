package com.zanydruid.shelfelf;

import android.support.v4.app.Fragment;


public class LiqueurActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new LiqueurFragment();
    }
}
