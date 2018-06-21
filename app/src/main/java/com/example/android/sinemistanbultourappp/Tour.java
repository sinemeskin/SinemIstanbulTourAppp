package com.example.android.sinemistanbultourappp;

public class Tour {

    private int mPictureId;
    private int mNameId;
    private int mOpenHoursId;
    private int mTelephoneId;
    private int mPriceId;
    private int mAddressId;

    public Tour(int pictureId, int nameId, int openHoursId, int telephoneId, int priceId, int addressId) {
        mPictureId = pictureId;
        mNameId = nameId;
        mOpenHoursId = openHoursId;
        mTelephoneId = telephoneId;
        mPriceId = priceId;
        mAddressId = addressId;
    }

    public int getPictureId() {
        return mPictureId;
    }

    public int getNameId() {
        return mNameId;
    }

    public int getOpenHoursId() {
        return mOpenHoursId;
    }

    public int getTelephoneId() {
        return mTelephoneId;
    }

    public int getmPriceId() {
        return mPriceId;
    }

    public int getAddressId() {
        return mAddressId;
    }


}
