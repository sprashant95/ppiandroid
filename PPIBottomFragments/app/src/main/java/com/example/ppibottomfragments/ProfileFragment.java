package com.example.ppibottomfragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class ProfileFragment extends Fragment {

    public ProfileFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] name = {"Mission Majnu","Rana Naidu","Pathan","Rocket Boys 2",
                "Shehzada","Gaslight","Chor Nikal Ke Bhaga",
                "Mission Majnu","Rana Naidu","Pathan","Rocket Boys 2",
                "Shehzada","Gaslight","Chor Nikal Ke Bhaga",
                "Mission Majnu","Rana Naidu","Pathan","Rocket Boys 2",
                "Shehzada","Gaslight","Chor Nikal Ke Bhaga"};

        String[] dates = {"Dec 2021","Jan 2021","Feb 2022","March 2022",
                "Dec 2021","Jan 2021","Feb 2022",
                "Dec 2021","Jan 2021","Feb 2022","March 2022",
                "Dec 2021","Jan 2021","Feb 2022",
                "Dec 2021","Jan 2021","Feb 2022","March 2022",
                "Dec 2021","Jan 2021","Feb 2022"};

        int[] images = {R.drawable.mm,R.drawable.rn,R.drawable.p,R.drawable.rb,
                R.drawable.s,R.drawable.gl,R.drawable.cnkb,
                R.drawable.mm,R.drawable.rn,R.drawable.p,R.drawable.rb,
                R.drawable.s,R.drawable.gl,R.drawable.cnkb,
                R.drawable.mm,R.drawable.rn,R.drawable.p,R.drawable.rb,
                R.drawable.s,R.drawable.gl,R.drawable.cnkb};

        ListView listView;

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        listView = view.findViewById(R.id.listview);

        MyProfileFragmentAdapter myProfileFragmentAdapter = new MyProfileFragmentAdapter(getActivity(),name,dates,images);
        listView.setAdapter(myProfileFragmentAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        return view;
    }


}