package com.example.bakhbk.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MonumentsDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_INTENT_MON = "sights_monuments";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentMus = getIntent();
        int mIndexPositionMus = intentMus.getIntExtra(EXTRA_INTENT_MON, -1);
        String messageMus = intentMus.getStringExtra(EXTRA_INTENT_MON);
        if (mIndexPositionMus == 0) {
            setContentView(R.layout.activity_details_monuments_0);
        } else if (mIndexPositionMus == 1) {
            setContentView(R.layout.activity_details_monuments_1);
        } else if (mIndexPositionMus == 2) {
            setContentView(R.layout.activity_details_monuments_2);
        } else if (mIndexPositionMus == 3) {
            setContentView(R.layout.activity_details_monuments_3);
        } else if (mIndexPositionMus == 4) {
            setContentView(R.layout.activity_details_monuments_4);
        } else {
            setContentView(R.layout.activity_details_monuments_5);
        }
    }
}