package com.example.raphaeloliveira.testebottombar.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raphaeloliveira.testebottombar.R;

public class GreenFragment extends Fragment {

    public GreenFragment() {
        super();
    }

    public static GreenFragment newInstance() {

        GreenFragment fragment = new GreenFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_green, container, false);
    }
}