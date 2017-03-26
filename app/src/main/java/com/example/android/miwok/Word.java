package com.example.android.miwok;

/**
 * Created by AKSPAN12 on 21-03-2017.
 */

public class Word {
    private String mDefaultTranslation;



    private String mMiwokTranslation;
    private int imageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;



    private int mAudioResourceId;


    public Word(String mDefaultTranslation, String mMiwokTranslation, int imageResourceId,int audioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.imageResourceId = imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
    public boolean hasImage(){return imageResourceId!=NO_IMAGE_PROVIDED;}
}
