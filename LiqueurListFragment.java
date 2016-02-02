package com.zanydruid.shelfelf;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by yizhu on 2/1/16.
 */
public class LiqueurListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private LiqueurAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list,container,false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.liqueur_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    public void updateUI(){
        LiqueurBox liqueurBox = LiqueurBox.get(getActivity());
        List<Liqueur> liqueurs= liqueurBox.getLiqueurs();
        mAdapter = new LiqueurAdapter(liqueurs);
        mRecyclerView.setAdapter(mAdapter);
    }

    public class LiqueurHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mNameTextView;
        private TextView mQuantityTextView;
        private Liqueur mLiqueur;

        public LiqueurHolder(View itemView) {
            super(itemView);
            mNameTextView = (TextView)itemView.findViewById(R.id.liqueur_list_name_text_view);
            mQuantityTextView = (TextView)itemView.findViewById(R.id.liqueur_list_quantity_text_view);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Toast.makeText(getActivity(),mLiqueur.getName()+"Clicked",Toast.LENGTH_SHORT).show();
        }

        // Helper method for showing data in view
        public void bindLiqueur(Liqueur liqueur){
            mLiqueur = liqueur;
            mNameTextView.setText(mLiqueur.getName());
            mQuantityTextView.setText(Integer.toString(mLiqueur.getQuantity()));
        }
    }

    public class LiqueurAdapter extends RecyclerView.Adapter<LiqueurHolder>{
        private List<Liqueur> mLiqueurs;

        public LiqueurAdapter(List<Liqueur> liqueurs){
            mLiqueurs = liqueurs;
        }

        @Override
        public LiqueurHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.liqueur_list_item,parent,false);
            return new LiqueurHolder(view);
        }

        @Override
        public void onBindViewHolder(LiqueurHolder holder, int position) {
            Liqueur liqueur = mLiqueurs.get(position);
            holder.bindLiqueur(liqueur);
        }

        @Override
        public int getItemCount() {
            return mLiqueurs.size();
        }
    }
}
