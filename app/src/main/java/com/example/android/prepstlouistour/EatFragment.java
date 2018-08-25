package com.example.android.prepstlouistour;


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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate ( R.layout.word_list, container, false );


        // Create an arraylist of places to explore
        final ArrayList <Place> places = new ArrayList <Place> ();
        places.add ( new Place ( getString ( R.string.eat_1 ), getString ( R.string.eat1_details ), getString ( R.string.eat1_address ) ) );
        places.add ( new Place ( getString ( R.string.eat_2 ), getString ( R.string.eat2_details ), getString ( R.string.eat2_address ) ) );
        places.add ( new Place ( getString ( R.string.eat_3 ), getString ( R.string.eat3_details ), getString ( R.string.eat3_address ) ) );
        places.add ( new Place ( getString ( R.string.eat_4 ), getString ( R.string.eat4_details ), getString ( R.string.eat4_address ) ) );


        PlaceAdapter adapter = new PlaceAdapter ( getActivity (), places, R.color.category_explore );


        ListView listView = (ListView) rootView.findViewById ( R.id.list );

        listView.setAdapter ( adapter );

        return rootView;

    }
}








