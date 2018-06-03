package com.example.bakhbk.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

public class SightsDetailsActivity extends Activity {

    // Key's name for all Intent
    public static final String EXTRA_INTENT_TITLE = "titleSight";
    public static final String EXTRA_INTENT_DESCRIPTION = "descriptionSight";
    public static final String EXTRA_INTENT_DESCRIPTION_TWO = "descriptionSightTwo";
    public static final String EXTRA_INTENT_IMAGE_ID_ONE = "imageIdOne";
    public static final String EXTRA_INTENT_IMAGE_ID_TWO = "imageIdTwo";
    public static final String EXTRA_INTENT_IMAGE_ID_THREE = "imageIdThree";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights_details);

        // Find the TextView in the activity_sights_details.xml layout with the ID text_view_title
        TextView titleSight = (TextView) findViewById(R.id.text_view_title);
        // Find the TextView in the activity_sights_details.xml layout with the ID text_view_description_1
        TextView descriptionSight = (TextView) findViewById(R.id.text_view_description_1);
        // Find the TextView in the activity_sights_details.xml layout with the ID text_view_description_2
        TextView descriptionSightTwo = (TextView) findViewById(R.id.text_view_description_2);
        // Find the ImageView in the activity_sights_details.xml layout with the ID image_view_0
        ImageView imageIdOne = (ImageView) findViewById(R.id.image_view_0);
        // Find the ImageView in the activity_sights_details.xml layout with the ID image_view_1
        ImageView imageIdTwo = (ImageView) findViewById(R.id.image_view_1);
        // Find the ImageView in the activity_sights_details.xml layout with the ID image_view_2
        ImageView imageIdThree = (ImageView) findViewById(R.id.image_view_2);

        // Get Intent from other Fragments
        Intent intent = getIntent();
        Bundle mIntent = intent.getExtras();
        String mTitleString = mIntent.getString(EXTRA_INTENT_TITLE);
        String mdescriptionSight = mIntent.getString(EXTRA_INTENT_DESCRIPTION);
        String mdescriptionSightTwo = mIntent.getString(EXTRA_INTENT_DESCRIPTION_TWO);
        int mImageOne = mIntent.getInt(EXTRA_INTENT_IMAGE_ID_ONE);
        int mImageIdTwo = mIntent.getInt(EXTRA_INTENT_IMAGE_ID_TWO);
        int mImageIdThree = mIntent.getInt(EXTRA_INTENT_IMAGE_ID_THREE);

        // Set intentions according to the target ID
        titleSight.setText(mTitleString);
        descriptionSight.setText(mdescriptionSight);
        descriptionSightTwo.setText(mdescriptionSightTwo);
        imageIdOne.setImageResource(mImageOne);
        imageIdTwo.setImageResource(mImageIdTwo);
        imageIdThree.setImageResource(mImageIdThree);
    }
}