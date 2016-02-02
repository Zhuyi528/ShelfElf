package com.zanydruid.shelfelf;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by yizhu on 2/1/16.
 */
public class LiqueurBox {

    private static LiqueurBox sLiqueur;
    private List<Liqueur> mLiqueurs;

    public static LiqueurBox get(Context context){
        if(sLiqueur==null){
            sLiqueur = new LiqueurBox(context);
        }
        return sLiqueur;
    }

    public List<Liqueur> getLiqueurs(){
        return mLiqueurs;
    }

    public LiqueurBox(Context context){
        mLiqueurs = new ArrayList<>();
        for(int i=0;i<50;i++){
            Liqueur liqueur = new Liqueur();
            liqueur.setName("Wine#"+i);
            liqueur.setQuantity(new Random().nextInt(12)+1);
            mLiqueurs.add(liqueur);
        }

    }
}
