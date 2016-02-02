package com.zanydruid.shelfelf;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yizhu on 2/1/16.
 */
public class LiqueurFragment extends Fragment {
    Liqueur mLiqueur;
    TextView mName;
    TextView mQuantity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLiqueur = new Liqueur();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_liqueur,container,false);
        mName = (TextView)view.findViewById(R.id.fragment_liqueur_name_text_view);
        mQuantity = (TextView)view.findViewById(R.id.fragment_liqueur_quantity_text_view);
        return view;
    }
}
