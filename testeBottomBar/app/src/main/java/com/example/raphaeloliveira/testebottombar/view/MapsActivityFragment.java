package com.example.raphaeloliveira.testebottombar.view;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raphaeloliveira.testebottombar.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MapsActivityFragment extends Fragment {

    public MapsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }
}
