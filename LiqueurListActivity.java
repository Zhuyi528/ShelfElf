package com.zanydruid.shelfelf;

import android.support.v4.app.Fragment;

/**
 * Created by yizhu on 2/1/16.
 */
public class LiqueurListActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new LiqueurListFragment();
    }
}
