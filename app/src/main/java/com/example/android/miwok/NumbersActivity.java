package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an arrayList of word
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "tmmokka", R.drawable.number_six));
        words.add(new Word("seven", "knekaku", R.drawable.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("nine", "wo'e", R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha", R.drawable.number_ten));

        // ArrayAdapter call
        // Instantiate an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


// TODO: remove once no longer necessary
        // Find the parent LinearLayout with ID rootView
        // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

//        Verify the array contents
//        int sizeOfArrayList = word.size();
//
//        // Loop through the array
//        for(int index = 0; index < sizeOfArrayList; index++){
//
//            Log.v("Array value at index " + index, word.get(index));
//
//            // Create a new view TextView with context this (NumbersActivity class)
//            TextView wordView = new TextView(this);
//
//            // Add the child view to the parent view
//            rootView.addView(wordView);
//
//            // Set the text on the view to the value in the array
//            wordView.setText(word.get(index));
//        }
    }

}
