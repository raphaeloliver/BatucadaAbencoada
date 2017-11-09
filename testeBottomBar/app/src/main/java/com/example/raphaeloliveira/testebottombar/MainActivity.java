package com.example.raphaeloliveira.testebottombar;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.raphaeloliveira.testebottombar.fragments.BlueFragment;
import com.example.raphaeloliveira.testebottombar.fragments.GreenFragment;
import com.example.raphaeloliveira.testebottombar.fragments.RedFragment;
import com.example.raphaeloliveira.testebottombar.utils.ActivityUtils;
import com.example.raphaeloliveira.testebottombar.view.MapsActivityFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {

                if(tabId == R.id.tab_blue){
                    ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),new BlueFragment(), R.id.contentFrame);
                }

                if(tabId == R.id.tab_green){
                    ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), new GreenFragment(), R.id.contentFrame);
                }

                if(tabId == R.id.tab_red){
                    ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), new RedFragment(), R.id.contentFrame);
                }
            }
        });

    }
}
