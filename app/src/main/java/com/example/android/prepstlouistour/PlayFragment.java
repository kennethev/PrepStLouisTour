package com.example.android.prepstlouistour;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate ( R.layout.word_list, container, false );

        // Create an arraylist of places to play
        final ArrayList <Place> places = new ArrayList <Place> ();
        places.add ( new Place (getString ( R.string.play_1),getString( R.string.play1_details),getString ( R.string.play1_address )));
        places.add ( new Place (getString( R.string.play_2), getString (R.string.play2_details), getString (R.string.play2_address )));
        places.add ( new Place (getString (  R.string.play_3), getString (R.string.play3_details), getString (R.string.play3_address) ));
        places.add ( new Place ( getString(R.string.play_4), getString (R.string.play4_details), getString(R.string.play4_address) ));


        PlaceAdapter adapter = new PlaceAdapter ( getActivity (), places, R.color.category_play );


        ListView listView = (ListView) rootView.findViewById ( R.id.list );

        listView.setAdapter ( adapter );

        return rootView;

    }
}









