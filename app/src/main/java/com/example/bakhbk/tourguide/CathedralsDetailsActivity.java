package com.example.bakhbk.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class CathedralsDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_INTENT_CATH = "sights_cath";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intentCath = getIntent();
        int mIndexPositionCath = intentCath.getIntExtra(EXTRA_INTENT_CATH, -1);
        String messageCath = intentCath.getStringExtra(EXTRA_INTENT_CATH);
        if(mIndexPositionCath == 0){
            setContentView(R.layout.activity_details_cathedrals_0);
        } else if (mIndexPositionCath == 1){
            setContentView(R.layout.activity_details_cathedrals_1);
        } else if (mIndexPositionCath == 2){
            setContentView(R.layout.activity_details_cathedrals_2);
        } else if (mIndexPositionCath == 3){
            setContentView(R.layout.activity_details_cathedrals_3);
        } else if (mIndexPositionCath == 4){
            setContentView(R.layout.activity_details_cathedrals_4);
        } else if (mIndexPositionCath == 5){
            setContentView(R.layout.activity_details_cathedrals_5);
        } else if (mIndexPositionCath == 6){
            setContentView(R.layout.activity_details_cathedrals_6);
        } else {
            setContentView(R.layout.activity_details_cathedrals_7);
        }

     }
}
