package com.example.bakhbk.tourguide;


import android.content.Context;
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

        // Create an array of words
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.monuments_text_horseman_0), getString(R.string.monuments_text_horseman_1), R.drawable.monuments_0_img_1));
        words.add(new Word(getString(R.string.monuments_text_alex_column_0), getString(R.string.monuments_text_alex_column_1), R.drawable.monuments_1_img_1));
        words.add(new Word(getString(R.string.monuments_text_narva_0), getString(R.string.monuments_text_narva_1), R.drawable.monuments_2_img_1));
        words.add(new Word(getString(R.string.cath_text_st_nicholas_0), getString(R.string.cath_text_st_nicholas_1), R.drawable.monuments_3_img_1));
        words.add(new Word(getString(R.string.monuments_text_peter1_0), getString(R.string.monuments_text_peter1_1), R.drawable.monuments_4_img_1));
        words.add(new Word(getString(R.string.monuments_text_sphinxes_0), getString(R.string.monuments_text_sphinxes_1), R.drawable.monuments_5_img_1));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), words, R.color.category_monuments);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // {@link position} pass onItemClick to CathedralsDetailsActivity by Intent
                Context context = view.getContext();
                Intent intent = new Intent(context, MonumentsDetailsActivity.class);
                intent.putExtra(MonumentsDetailsActivity.EXTRA_INTENT_MON, position);
                context.startActivity(intent);

            }
        });
        return rootView;
    }
}
