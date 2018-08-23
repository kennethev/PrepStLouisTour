 package com.example.android.prepstlouistour;



import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LearnFragment extends Fragment {


    public LearnFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

      // Create an arraylist of words
    final ArrayList<Place> places = new ArrayList <Place> ();
        places.add (new Place(R.string.learn_1,R.string.learn1_details,R.string.learn1_address,R.drawable.androidwashu"));
        places.add (new Place (R.string.learn_2,R.string.learn2_details, R.string.learn2_address,R.drawable.androidstlu"));
        places.add (new Place (R.string.learn_3,R.string.learn3_details, R.string.learn3_address,R.drawable.androidharrisstowe));
        places.add (new Place(R.string.learn_4,R.string.learn4_details, R.string.learn4_address,R.drawable.androidfontbonne"));

                PlaceAdapter adapter = new PlaceAdapter ( getActivity(), places, R.color.category_learn );

    ListView listView = (ListView) rootView.findViewById ( R.id.list );

        listView.setAdapter(adapter);

        return rootView;

        }
}

