 package com.example.android.prepstlouistour;



import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
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
        // Inflate the layout for this fragment
        return inflater.inflate ( R.layout.fragment_learn, container, false );
    }
    View rootView = inflater.inflate(R.layout.word_list, container, false);

      // Create an arraylist of words
    final ArrayList<com.example.android.prepstlouistour.Word> words = new ArrayList <com.example.android.prepstlouistour.Word> ();
        words.add (new Word(R.string.learn_1","R.string.learn1_details","R.string.learn_1address","R.drawable.androidwashu"));
        words.add (new com.example.android.prepstlouistour.Word("R.string.learn_2","R.string.learn2_details", "R.string.learn2_address",R.drawable.androidstlu"));
        words.add (new com.example.android.prepstlouistour.Word("R.string.learn_3","R.string.learn3_details","R.string.learn3_address","R.drawable.androidharrisstowe"));
        words.add (new Word( "R.string.learn_4",R.string.learn4_details", "R.string.learn4_address","R.drawable.androidfontbonne"));

            com.example.android.prepstlouistour.WordAdapter adapter = new com.example.android.prepstlouistour.WordAdapter(getActivity() words,
R.color.category_learn);


    ListView listView = (ListView) rootView.findViewById ( R.id.list );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener (){

    {
        @Override
        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
        com.example.android.prepstlouistour.Word word = words.get ( position );

        return rootView;
    }
    }
}
}





        }
