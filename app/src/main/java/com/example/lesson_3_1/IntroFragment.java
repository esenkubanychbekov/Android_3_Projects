package com.example.lesson_3_1;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment extends Fragment {


    public IntroFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_intro, container, false);
        TextView textView = view.findViewById(R.id.textFragment);
        int pos = getArguments().getInt("pos");

        switch (pos){
            case 0:
                textView.setText("Fragment1");
                break;
            case 1:
                textView.setText("Fragment2");
                break;
            case 2:
            textView.setText("Fragment3");
            break;

        }

        return view;
    }

}
