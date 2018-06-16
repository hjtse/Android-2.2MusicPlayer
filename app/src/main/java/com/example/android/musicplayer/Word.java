package com.example.android.musicplayer;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a primary and secondary title
 */
public class Word {

    /** Main text */
    private String mMainText;

    /** Secondary text */
    private String mSecondaryText;

    /**
     * Create a new Word object.
     *
     * @param mainText primary title
     * @param secondaryText subtitle
     */
    public Word(String mainText, String secondaryText) {
        mMainText = mainText;
        mSecondaryText = secondaryText;
    }

    /**
     * Get the Primary Text
     */
    public String getMainText() {
        return mMainText;
    }

    /**
     * Get the Secondary Text
     */
    public String getSecondaryText() {
        return mSecondaryText;
    }

}