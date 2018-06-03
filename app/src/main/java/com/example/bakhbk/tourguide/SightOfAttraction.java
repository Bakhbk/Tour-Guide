package com.example.bakhbk.tourguide;

/**
 * {@link SightOfAttraction} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation fo that word.
 */

public class SightOfAttraction {

    // Default translation for the word
    private String mTitleSight;

    // Miwok translation for the word
    private String mDescriptionSightOne;
    private String mDescriptionSightTwo;

    // Image resource ID for the word
    private int mImageResourceIDOne = NO_IMAGE_PROVIDED;
    private int mImageResourceIDTwo = NO_IMAGE_PROVIDED;
    private int mImageResourceIDThree = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Create a new SightOfAttraction object
    // @param titleSight is the sights that the user will see on title
    // @param descriptionSightOne is the sights that the user will see on text
    // @param imageResourceIDOne is the drawable resource ID for the image associated with the sight
    public SightOfAttraction(String titleSight, String descriptionSightOne, String descriptionSightTwo, int imageResourceIDOne, int imageResourceIDTwo, int imageResourceIDThree) {
        mTitleSight = titleSight;
        mDescriptionSightOne = descriptionSightOne;
        mDescriptionSightTwo = descriptionSightTwo;
        mImageResourceIDOne = imageResourceIDOne;
        mImageResourceIDTwo = imageResourceIDTwo;
        mImageResourceIDThree = imageResourceIDThree;
    }

    // Get the Miwok translation of the word.
    public String getTitleSight() {
        return mTitleSight;
    }

    // Get the default translation of the word.
    public String getDescriptionsSightOne() {
        return mDescriptionSightOne;
    }

    // Get the default translation of the word.
    public String getDescriptionsSightTwo() {
        return mDescriptionSightTwo;
    }

    // Get the image resource ID of the word.
    public int getImageResourceIDOne() {
        return mImageResourceIDOne;
    }

    // Get the image resource ID of the word.
    public int getImageResourceIDTwo() {
        return mImageResourceIDTwo;
    }

    // Get the image resource ID of the word.
    public int getImageResourceIDThree() {
        return mImageResourceIDThree;
    }

    // Returns whether or not there is an image for this word
    public boolean hasImage() {
        return mImageResourceIDOne != NO_IMAGE_PROVIDED;
    }
}
