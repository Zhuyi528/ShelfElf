package com.zanydruid.shelfelf;

import java.util.UUID;

/**
 * Created by yizhu on 2/1/16.
 */
public class Liqueur {
    private int mId;
    private String mName;
    private String mType;
    private int mQuantity;
    private String mDescription;
    private int mShfId;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public void setQuantity(int quantity) {
        mQuantity = quantity;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getShfId() {
        return mShfId;
    }

    public void setShfId(int shfId) {
        mShfId = shfId;
    }
}
