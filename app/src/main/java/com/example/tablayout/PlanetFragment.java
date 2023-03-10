package com.example.tablayout;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class PlanetFragment extends Fragment {
    RecyclerView rvPlanet;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_planet, container, false);
        rvPlanet = v.findViewById(R.id.rvPlanet);
        rvPlanet.setLayoutManager(new LinearLayoutManager(getActivity()));
        ForAdapter animalsAdapter = new ForAdapter(dummyPlanetList(),dummyPhotoList());
        rvPlanet.setAdapter(animalsAdapter);

        return  v;
    }
    ArrayList<String> dummyPlanetList() {
        ArrayList<String> planetList = new ArrayList<>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Saturn");
        planetList.add("Uranus");


        return planetList;

    }
    ArrayList<Integer> dummyPhotoList() {
        ArrayList<Integer> photoList = new ArrayList<Integer>();
        photoList.add(R.drawable.mercury);
        photoList.add(R.drawable.venus);
        photoList.add(R.drawable.earth);
        photoList.add(R.drawable.mar);
        photoList.add(R.drawable.jupiter);
        photoList.add(R.drawable.saturn);
        photoList.add(R.drawable.uranus);




        return photoList;

    }
}