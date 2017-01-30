package com.example.android.miwok;
/**
 * Created by lmohamed on 1/15/17.
 */


/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /* State of the Word object
    * member variables
    */

    private int mImageResourceId = NO_IMAGE_FOUND;    // image resource ID
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /** Constant value that represents no image was provided for this word **/
    private static final int NO_IMAGE_FOUND = -1;


    /**
     * The constructor
     * Name of constructor must match class name. It has no return type
     *
     * Create a new Word Object
     *
     * @param defaultTranslation is the default language of the phone set to private variable mDefaultTranslation
     * @param miwokTranslation is the Miwok translation of the word set to private variable mMiwokTranslation
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation =  defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Word Object
     *
     * @param defaultTranslation is the default language of the phone set to private variable mDefaultTranslation
     * @param miwokTranslation is the Miwok translation of the word set to private variable mMiwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation =  defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Create the getter methods
     **/

    // Get the image corresponding to the word
    public int getImageResourceId() { return mImageResourceId; }

    // Returns whether an image is set or not
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_FOUND; }

    // Get the default translation of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
