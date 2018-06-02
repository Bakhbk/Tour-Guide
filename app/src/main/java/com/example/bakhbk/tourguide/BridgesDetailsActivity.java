package com.example.bakhbk.tourguide;



import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class BridgesDetailsActivity extends AppCompatActivity {

    public static final String EXTRA_INTENT_BRIDGES = "sights_bridges";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get intent selected onItemClick array from BridgesFragment
        Intent intentMus = getIntent();
        int mIndexPositionMus = intentMus.getIntExtra(EXTRA_INTENT_BRIDGES, -1);
        String messageMus= intentMus.getStringExtra(EXTRA_INTENT_BRIDGES);
        if(mIndexPositionMus == 0){
            setContentView(R.layout.activity_details_bridges_0);
        } else if (mIndexPositionMus == 1){
            setContentView(R.layout.activity_details_bridges_1);
        } else if (mIndexPositionMus == 2){
            setContentView(R.layout.activity_details_bridges_2);
        } else if (mIndexPositionMus == 3){
            setContentView(R.layout.activity_details_bridges_3);
        } else if (mIndexPositionMus == 4){
            setContentView(R.layout.activity_details_bridges_4);
        } else if (mIndexPositionMus == 5){
            setContentView(R.layout.activity_details_bridges_5);
        } else if (mIndexPositionMus == 6){
            setContentView(R.layout.activity_details_bridges_6);
        } else {
            setContentView(R.layout.activity_details_bridges_7);
        }
    }
}