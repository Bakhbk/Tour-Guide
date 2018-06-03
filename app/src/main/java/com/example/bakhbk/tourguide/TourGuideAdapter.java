package com.example.bakhbk.tourguide;


import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourGuideAdapter extends ArrayAdapter<SightOfAttraction> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;


    // This is our own custom constructor (it doesn't mirror a superclass constructor).
    // The context is used to inflate the layout file, and the list is the data we want
    // to populate into the lists.
    // @param context        The current context. Used to inflate the layout file.
    // @param androidSightOfAttractions A List of TourGuideAdapter objects to display in a list
    // @param colorResourceId is the resource ID for the background color for this list of words
    public TourGuideAdapter(Activity context, ArrayList<SightOfAttraction> androidSightOfAttractions, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidSightOfAttractions);
        mColorResourceId = colorResourceId;
    }

    // Provides a view for an AdapterView (ListView, GridView, etc.)
    // @param position The position in the list of data that should be displayed in the list item view.
    // @param convertView The recycled view to populate.
    // @param parent The parent ViewGroup that is used for inflation.
    // @return The View for the position in the AdapterView.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link SightOfAttraction} object located at this position in the list
        SightOfAttraction currentSightOfAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_sights_text_view
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title_sights_text_view);
        // Get the version name from the current SightOfAttraction object and
        // set this text on the name TextView
        titleTextView.setText(currentSightOfAttraction.getTitleSight());

        // Find the TextView in the list_item.xml layout with the ID description_text_view
        TextView descriptionSights = (TextView) convertView.findViewById(R.id.description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        descriptionSights.setText(currentSightOfAttraction.getDescriptionsSightOne());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        if (currentSightOfAttraction.hasImage()) {
            // Set the ImageView to the image resource specified in the current SightOfAttraction
            imageView.setImageResource(currentSightOfAttraction.getImageResourceIDOne());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return convertView;
    }
}
