package com.example.hp.campusconnect;

import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity implements NotificationsFragment.OnListFragmentInteractionListener, NoticesFragment.OnListFragmentInteractionListener, HomeFragment.OnFragmentInteractionListener, AddComplaintFragment.OnFragmentInteractionListener, MyComplaintsFragment.OnFragmentInteractionListener, UpdateProfileFragment.OnFragmentInteractionListener {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.bottom_nav);
        getFragmentManager().beginTransaction().add(R.id.home_frame_layout, new HomeFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.home:
                        fragmentTransaction.replace(R.id.home_frame_layout, new HomeFragment());
                        break;
                    case R.id.notices:
                        fragmentTransaction.replace(R.id.home_frame_layout, new NoticesFragment());
                        break;
                    case R.id.add:
                        fragmentTransaction.replace(R.id.home_frame_layout, new AddComplaintFragment());
                        break;
                    case R.id.notifications:
                        fragmentTransaction.replace(R.id.home_frame_layout, new NotificationsFragment());
                        break;
                    case R.id.my_profile:
                        fragmentTransaction.replace(R.id.home_frame_layout, new MyProfileFragment());
                        break;
                }
                fragmentTransaction.commit();
                return true;
            }

        });
    }

    @Override
    public void onListFragmentInteraction() {

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}