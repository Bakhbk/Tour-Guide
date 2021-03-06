package com.example.bakhbk.tourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BridgesFragment extends Fragment {

    public BridgesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an array of sightOfAttractions
        final ArrayList<SightOfAttraction> sightOfAttractions = new ArrayList<>();
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_anichkov_0),
                getString(R.string.bridges_text_anichkov_1),
                getString(R.string.bridges_text_anichkov_2),
                R.drawable.bridges_0_img_1,
                R.drawable.bridges_0_img_2,
                R.drawable.bridges_0_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_bank_0),
                getString(R.string.bridges_text_bank_1),
                getString(R.string.bridges_text_bank_2),
                R.drawable.bridges_1_img_1,
                R.drawable.bridges_1_img_2,
                R.drawable.bridges_1_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_annunciation_0),
                getString(R.string.bridges_text_annunciation_1),
                getString(R.string.bridges_text_annunciation_2),
                R.drawable.bridges_2_img_1,
                R.drawable.bridges_2_img_2,
                R.drawable.bridges_2_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_bolsheokhtinsky_0),
                getString(R.string.bridges_text_bolsheokhtinsky_1),
                getString(R.string.bridges_text_bolsheokhtinsky_2),
                R.drawable.bridges_3_img_1,
                R.drawable.bridges_3_img_2,
                R.drawable.bridges_3_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_obukhovsky_0),
                getString(R.string.bridges_text_obukhovsky_1),
                getString(R.string.bridges_text_obukhovsky_2),
                R.drawable.bridges_4_img_1,
                R.drawable.bridges_4_img_2,
                R.drawable.bridges_4_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_palace_0),
                getString(R.string.bridges_text_palace_1),
                getString(R.string.bridges_text_palace_2),
                R.drawable.bridges_5_img_1,
                R.drawable.bridges_5_img_2,
                R.drawable.bridges_5_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_liteyny_0),
                getString(R.string.bridges_text_liteyny_1),
                getString(R.string.bridges_text_liteyny_2),
                R.drawable.bridges_6_img_1,
                R.drawable.bridges_6_img_2,
                R.drawable.bridges_6_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.bridges_text_trinity_0),
                getString(R.string.bridges_text_trinity_1),
                getString(R.string.bridges_text_trinity_1),
                R.drawable.bridges_7_img_1,
                R.drawable.bridges_7_img_2,
                R.drawable.bridges_7_img_3));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), sightOfAttractions, R.color.category_bridges);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of sightOfAttractions.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link SightOfAttraction} object at the given position the user clicked on
                SightOfAttraction sightOfAttraction = sightOfAttractions.get(position);
                // {@link positions} pass onItemClick to SightsDetailsActivity by Intent
                String title = sightOfAttraction.getTitleSight();
                String description = sightOfAttraction.getDescriptionsSightOne();
                String descriptionTwo = sightOfAttraction.getDescriptionsSightTwo();
                int imageIdOne = sightOfAttraction.getImageResourceIDOne();
                int imageIdTwo = sightOfAttraction.getImageResourceIDTwo();
                int imageIdThree = sightOfAttraction.getImageResourceIDThree();

                Intent intent = new Intent(getActivity(), SightsDetailsActivity.class);
                intent.putExtra(SightsDetailsActivity.EXTRA_INTENT_TITLE, title);
                intent.putExtra(SightsDetailsActivity.EXTRA_INTENT_DESCRIPTION, description);
                intent.putExtra(SightsDetailsActivity.EXTRA_INTENT_DESCRIPTION_TWO, descriptionTwo);
                intent.putExtra(SightsDetailsActivity.EXTRA_INTENT_IMAGE_ID_ONE, imageIdOne);
                intent.putExtra(SightsDetailsActivity.EXTRA_INTENT_IMAGE_ID_TWO, imageIdTwo);
                intent.putExtra(SightsDetailsActivity.EXTRA_INTENT_IMAGE_ID_THREE, imageIdThree);

                startActivity(intent);
            }
        });
        return rootView;
    }
}