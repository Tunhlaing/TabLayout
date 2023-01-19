package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tlMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Discovery");
        tlMain = findViewById(R.id.tlMain);

        tlMain.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
                public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0: {
                        PlantsFragment plantsFragment = new PlantsFragment();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fcMain, plantsFragment);
                        transaction.commit();
                        break;
                    }
                    case 1: {
                        AnimalsFragment animalsFragment = new AnimalsFragment();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fcMain, animalsFragment);
                        transaction.commit();
                        break;
                    }
                    case 2: {
                        PlanetFragment planetFragment = new PlanetFragment();
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fcMain, planetFragment);
                        transaction.commit();
                        break;
                    }

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}

//
//    AnimalsFragment animalsFragment = new AnimalsFragment();
//    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.fcMain,animalsFragment);
//                transaction.commit();