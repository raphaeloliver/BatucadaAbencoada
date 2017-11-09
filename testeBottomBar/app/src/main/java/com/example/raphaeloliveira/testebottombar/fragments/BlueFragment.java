package com.example.raphaeloliveira.testebottombar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raphaeloliveira.testebottombar.R;

public class BlueFragment extends Fragment {

    public BlueFragment() {
        super();
    }

    public static BlueFragment newInstance() {

        BlueFragment fragment = new BlueFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_blue, container, false);
    }
}
