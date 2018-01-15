package com.example.hp.campusconnect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MyProfileFragment extends android.app.Fragment {
    View gridtype;
    String[] title = {"My Complaints", "Update Profile", "Change Password", "Logout"};
    int[] imgs = {R.drawable.complaints, R.drawable.update, R.drawable.key, R.drawable.log};
    ListView lv;

    public MyProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        gridtype = inflater.inflate(R.layout.fragment_my_profile, container, false);
        lv = gridtype.findViewById(R.id.lv);
        MyAdapter adapter = new MyAdapter(getActivity().getApplicationContext(), title, imgs);
        lv.setAdapter(adapter);
        // Inflate the layout for this fragment
        gridtype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return gridtype;
    }
}