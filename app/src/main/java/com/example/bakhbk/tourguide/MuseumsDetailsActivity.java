package com.example.bakhbk.tourguide;



import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MuseumsDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_INTENT_MUS = "sights_museums";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get intent selected onItemClick array from MuseumsFragment
        Intent intent = getIntent();
        int mIndexPositionMus = intent.getIntExtra(EXTRA_INTENT_MUS, -1);
        String messageMus= intent.getStringExtra(EXTRA_INTENT_MUS);
        if(mIndexPositionMus == 0){
            setContentView(R.layout.activity_details_musuems_0);
        } else if (mIndexPositionMus == 1){
            setContentView(R.layout.activity_details_musuems_1);
        } else if (mIndexPositionMus == 2){
            setContentView(R.layout.activity_details_musuems_2);
        } else if (mIndexPositionMus == 3){
            setContentView(R.layout.activity_details_musuems_3);
        } else if (mIndexPositionMus == 4){
            setContentView(R.layout.activity_details_musuems_4);
        } else if (mIndexPositionMus == 5){
            setContentView(R.layout.activity_details_musuems_5);
        } else if (mIndexPositionMus == 6){
            setContentView(R.layout.activity_details_musuems_6);
        } else if (mIndexPositionMus == 7){
            setContentView(R.layout.activity_details_musuems_7);
        } else{
            setContentView(R.layout.activity_details_musuems_8);
        }
    }
}