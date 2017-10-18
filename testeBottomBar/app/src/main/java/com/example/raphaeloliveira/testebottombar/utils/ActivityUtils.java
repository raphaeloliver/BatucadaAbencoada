package com.example.raphaeloliveira.testebottombar.utils;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class ActivityUtils {

    public static void addFragmentToActivity (@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, int frameId) {
        if (fragmentManager == null) {
            throw new RuntimeException("fragmentManager is null");
        }

        if (fragment == null) {
            throw new RuntimeException("fragment is null");
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment);
        transaction.commit();
    }

    public static void replaceFragmentToActivity (@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, int frameId) {
        if (fragmentManager == null) {
            throw new RuntimeException("fragmentManager is null");
        }

        if (fragment == null) {
            throw new RuntimeException("fragment is null");
        }

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(frameId, fragment);
        transaction.addToBackStack(fragment.toString());
        transaction.commit();
    }
}
