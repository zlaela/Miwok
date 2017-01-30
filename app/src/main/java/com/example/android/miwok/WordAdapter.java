package com.example.android.miwok;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lmohamed on 1/15/17.
 */

public class WordAdapter extends ArrayAdapter<Word>{

    /**
     * This is the custom constructor
     *
     * The context is used to inflate the layout file and the list is Word objects
     * @param context is the current context passed in from the class
     * @param words is a list of Word objects created in the Words.java class.
     */
    public WordAdapter(Activity context, ArrayList<Word> words){


        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // We use the constructor from ArrayAdapter (superclass) to initialize the ArrayAdapter for free
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to create the ListItem, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    /**
     * Provides a view for the AdapterView
     *
     * @param position      The position in the list of data that should be displayed in the list data
     * @param convertView   The recycled view to populate
     * @param parent        The parent ViewGroup that is used for inflation
     * @return              The View for the position in the AdapterView
     */

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Check if the existing view is being reused, otherwise inflate the view
        View row = convertView;

        if (row == null) {
            row = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        } else {
            row = convertView;
        }

        //find the ImageView in the list_item.xml layout with the ID image
        ImageView image = (ImageView) row.findViewById(R.id.image);

        // Check if the current word has an image provided
        if(currentWord.hasImage()) {
            // If an image is provided, display te image by its resource ID
            int img = currentWord.getImageResourceId();
            image.setImageResource(img);
            image.setVisibility(View.VISIBLE);
        } else {
            // otherwise hide the ImageView
            image.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultLanguage = (TextView) row.findViewById(R.id.default_text_view);
        // Get the default language translation from the current Word object and set the text to it
        defaultLanguage.setText(currentWord.getDefaultTranslation());


        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokLangauge = (TextView) row.findViewById(R.id.miwok_text_view);
        // Get the Miwok language translation from the current Word object and set the text to it
        miwokLangauge.setText(currentWord.getMiwokTranslation());


        // Return the whole list item layout (2 text views) so it can be visible in the ListView
        // and add it as a child view of the ArrayAdapter
        return row;
    }
}
