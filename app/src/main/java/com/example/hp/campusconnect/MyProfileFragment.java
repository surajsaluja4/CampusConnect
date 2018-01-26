package com.example.hp.campusconnect;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class MyProfileFragment extends android.app.Fragment {
    View gridtype;
    String[] title = {"My Complaints", "Update Profile", "Logout"};
    int[] imgs = {R.drawable.complaints, R.drawable.update, R.drawable.log};
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
        getActivity().findViewById(R.id.bottom_nav).setVisibility(View.VISIBLE);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction fragmentTransaction;
                switch (position) {
                    case 0:
                        getActivity().findViewById(R.id.bottom_nav).setVisibility(View.GONE);
                        fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.home_frame_layout, new MyComplaintsFragment());
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                    case 1:
                        getActivity().findViewById(R.id.bottom_nav).setVisibility(View.GONE);
                        fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.home_frame_layout, new UpdateProfileFragment());
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        break;
                    case 2:

                }
            }
        });
        // Inflate the layout for this fragment
        gridtype.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return gridtype;
    }
}