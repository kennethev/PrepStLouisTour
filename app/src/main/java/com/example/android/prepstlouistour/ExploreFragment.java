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
public class ExploreFragment extends Fragment {


    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView inflater.inflate ( R.layout.word_list, container, false );


    // Create an arraylist of places to explore
        final ArrayList<Place> places = new ArrayList <Place> ();
        places.add(new Place (R.string.explore_1, R.string.explore1_details, R.string.explore1_address));
        places.add(new Place (R.string.explore_2, R.string.explore2_details,R.string.explore2_address));
        places.add(new Place (R.string.explore_3, R.string.explore3_details, R.string.explore3_address);
        places.add(new Place (R.string.explore_4, R.string.explore4_details, R.string.explore4_address));


    PlaceAdapter adapter = new PlaceAdapter ( getActivity (),places, R.color.category_explore );


    ListView listView = (ListView) rootView.findViewById ( R.id.list );

        listView.setAdapter (adapter);

        return rootView;

}
}
















