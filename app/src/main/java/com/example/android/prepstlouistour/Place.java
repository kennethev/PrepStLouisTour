package com.example.android.prepstlouistour;

public class Place {


    //A string for the places in the area.

    private String mPlacesVisit;

    //A string for the description of places to visit.

    private String mPlacesDetails;

    //A string for the addresses of places to visit
    private String mPlacesAddresses;

    //Image resource files for the places to visit.

    private int mPlacesImage = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = 0;


    public Place(String placesVisit, String placesDetails, String placesAddresses) {
        mPlacesVisit = placesVisit;
        mPlacesDetails = placesDetails;
        mPlacesAddresses = placesAddresses;

    }

    public Place(String placesVisit, String placesDetails, String placesAddresses, int placesImage) {

        mPlacesVisit = placesVisit;
        mPlacesDetails = placesDetails;
        mPlacesAddresses = placesAddresses;
        mPlacesImage = placesImage;

    }


    public String getPlacesVisit() {
        return mPlacesVisit;

    }

    public String getPlacesDetails() {
        return mPlacesDetails;

    }

    public String getPlacesAddresses() {
        return mPlacesAddresses;
    }

    public int getPlacesImage() {
        return mPlacesImage;

    }

    public boolean hasImage() {
        return mPlacesImage != NO_IMAGE_PROVIDED;
    }
}






