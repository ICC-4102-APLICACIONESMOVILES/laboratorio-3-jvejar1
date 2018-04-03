package com.example.e440.lab2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.support.v4.app.Fragment;
import android.view.ViewGroup;
/**
 * Created by e440 on 03-04-18.
 */

public class viewFormFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.viewformfragment, parent, false);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }




}
