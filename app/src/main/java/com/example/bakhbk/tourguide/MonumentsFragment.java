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
public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create an array of sightOfAttractions
        final ArrayList<SightOfAttraction> sightOfAttractions = new ArrayList<>();
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.monuments_text_horseman_0),
                getString(R.string.monuments_text_horseman_1),
                getString(R.string.monuments_text_horseman_2),
                R.drawable.monuments_0_img_1,
                R.drawable.monuments_0_img_2,
                R.drawable.monuments_0_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.monuments_text_alex_column_0),
                getString(R.string.monuments_text_alex_column_1),
                getString(R.string.monuments_text_alex_column_2),
                R.drawable.monuments_1_img_1,
                R.drawable.monuments_1_img_2,
                R.drawable.monuments_1_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.monuments_text_narva_0),
                getString(R.string.monuments_text_narva_1),
                getString(R.string.monuments_text_narva_2),
                R.drawable.monuments_2_img_1,
                R.drawable.monuments_2_img_2,
                R.drawable.monuments_2_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.cath_text_st_nicholas_0),
                getString(R.string.cath_text_st_nicholas_1),
                getString(R.string.cath_text_st_nicholas_2),
                R.drawable.monuments_3_img_1,
                R.drawable.monuments_3_img_2,
                R.drawable.monuments_3_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.monuments_text_peter1_0),
                getString(R.string.monuments_text_peter1_1),
                getString(R.string.monuments_text_peter1_2),
                R.drawable.monuments_4_img_1,
                R.drawable.monuments_4_img_2,
                R.drawable.monuments_4_img_3));
        sightOfAttractions.add(new SightOfAttraction(
                getString(R.string.monuments_text_sphinxes_0),
                getString(R.string.monuments_text_sphinxes_1),
                getString(R.string.monuments_text_sphinxes_2),
                R.drawable.monuments_5_img_1,
                R.drawable.monuments_5_img_2,
                R.drawable.monuments_5_img_3));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), sightOfAttractions, R.color.category_monuments);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

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
