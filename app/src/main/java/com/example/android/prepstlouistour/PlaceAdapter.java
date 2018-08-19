package com.example.android.prepstlouistour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


    public class PlaceAdapter extends ArrayAdapter<Place> {


        //A custom adapter to list the place information.

        public PlaceAdapter(Activity context, ArrayList<Place> places) {

            super(context, 0, places);

        }

        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

            Place place = getItem(position);



            View listItemView = convertView;

            if (listItemView == null) {

                listItemView = LayoutInflater.from(getContext()).inflate(

                        R.layout.activity_place, parent, false);

            }


            //Finds the ImageView for the image of the place to visit.

            ImageView placesImageView = (ImageView) listItemView.findViewById(R.id.place_image);



            //Finds the TextView for the name of the place to visit.

            TextView placesVisitTextView = (TextView) listItemView.findViewById(R.id.places_visit);



            //Finds the TextView for the details of the place to visit.

            TextView placesDetailsTextView = (TextView) listItemView.findViewById(R.id.places_details);

            //Finds the TextView for the addresses of the place to visit.

            TextView placesAddressesTextView = (TextView) listItemView.findViewById(R.id.places_addressess);


            //Gets the image of the place to visit and sets it on the ImageView.

            placesImageView.setImageResource(place.getPlacesImage());



            //Gets the text for the place and sets it on the TextView.

            placesVisitTextView.setText(place.getPlacesVisit());



            //Gets the text for the details and sets it on the TextView.

            placesDetailsTextView.setText(place.getPlacesDetails());

        //Gets the text for the addresses and sets it on the TextView.

            placesAddressesTextView.setText(place.getPlacesAddresses());


            return listItemView;

        }

    }


}
