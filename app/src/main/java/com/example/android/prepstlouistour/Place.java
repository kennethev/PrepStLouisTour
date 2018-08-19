package com.example.android.prepstlouistour;

public class Place {


        //A string for the places in the area.

        private String tPlacesVisit;

        //A string for the description of places to visit.

        private String tPlacesDetails;

        //A string for the addresses of places to visit
    private String tPlacesAddresses;

        //Image resource files for the places to visit.

        private int tPlacesImage;


        public Place(String placesVisit, String placesDetails, String placesAddresses,int placesImage) {

            tPlacesVisit = placesVisit;

            tPlacesDetails = placesDetails;
            tPlacesAddresses = placesAddresses;
            tPlacesImage = placesImage;

        }

        public String getPlacesVisit() {
            return tPlacesVisit;

        }

        public String getPlacesDetails() {
            return tPlacesDetails;

        }

        public String gettPlacesAddresses() {
            return tPlacesAddresses;
        }

        public int getPlacesImage() {

            return tPlacesImage;

        }

    }






