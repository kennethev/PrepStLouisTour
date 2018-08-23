package com.example.android.prepstlouistour;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


    public class PlaceAdapter extends ArrayAdapter<Place> {
        private int mColorResourceId;

        //A custom adapter to list the place information.

        public PlaceAdapter(Activity context, ArrayList<Place> places, int colorResourceId) {
            super(context, 0, places);
            mColorResourceId = colorResourceId;
        }

        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

            View listItemView = convertView;

            if (listItemView == null) {

                listItemView = LayoutInflater.from(getContext()).inflate(

                        R.layout.list_item, parent, false);

            }
            Place currentPlaces = getItem ( position );


            //Finds the TextView for the name of the place to visit.

            TextView placesVisitTextView = (TextView) listItemView.findViewById(R.id.placesvisit_text_view);
            //Gets the text for the place and sets it on the TextView.
            placesVisitTextView.setText(currentPlaces.getPlacesVisit());


            //Finds the TextView for the details of the place to visit.

            TextView placesDetailsTextView = (TextView) listItemView.findViewById(R.id.place_details);
            //Gets the text for the details and sets it on the TextView.
            placesDetailsTextView.setText(currentPlaces.getPlacesDetails());


            //Finds the TextView for the addresses of the place to visit.

            TextView placesAddressesTextView = (TextView) listItemView.findViewById(R.id.place_addresses);
            //Gets the text for the addresses and sets it on the TextView.
            placesAddressesTextView.setText(currentPlaces.getPlacesAddresses ());


            //Finds the ImageView for the image of the place to visit.
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);


            //Gets the image of the place to visit and sets it on the ImageView
            imageView.setImageResource(currentPlaces.getPlacesImage ());

            //check to see if places has image
            if (currentPlaces.hasImage()) {
                //if image is available use it
               imageView.setImageResource ( currentPlaces.getPlacesImage ());
                //make sure view
                imageView.setVisibility ( View.VISIBLE );
            }else {
                //if not hide image
                imageView.setVisibility ( View.GONE );
            }

            //set the theme color for list item
            View textContainer = listItemView.findViewById ( R.id.text_container );
            //find color that resources ID's
            int color = ContextCompat.getColor(getContext(),
            mColorResourceId);

//set background color of text container
            textContainer.setBackgroundColor(color);

            return listItemView;

        }

    }



