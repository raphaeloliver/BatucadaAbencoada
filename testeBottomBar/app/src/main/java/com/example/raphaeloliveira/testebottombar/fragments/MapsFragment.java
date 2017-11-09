package com.example.raphaeloliveira.testebottombar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raphaeloliveira.testebottombar.R;
import com.example.raphaeloliveira.testebottombar.MapsActivity;

public class MapsFragment extends Fragment {

    public MapsFragment() {
        super();
    }

    public static MapsFragment newInstance() {

        MapsFragment fragment = new MapsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Intent intent = new Intent(getActivity(), MapsActivity.class);
        startActivity(intent);

        return inflater.inflate(R.layout.fragment_green, container, false);
    }
}
