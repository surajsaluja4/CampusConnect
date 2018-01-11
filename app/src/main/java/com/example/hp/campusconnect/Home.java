package com.example.hp.campusconnect;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        HomeFragment homeFragment=new HomeFragment();
      android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
      fragmentTransaction.replace(R.id.home_frame,homeFragment);
      fragmentTransaction.commit();


        bottomNavigationView=(BottomNavigationView)findViewById(R.id.home_bottom_nav);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                android.support.v4.app.FragmentTransaction fragmentTransaction1;
                switch (item.getItemId()){
                    case R.id.home:
                        HomeFragment homeFragment=new HomeFragment();
                         fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.home_frame,homeFragment);
                        fragmentTransaction1.commit();
                        Toast.makeText(getApplicationContext(),"Home Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.announcement:
                        NoticesFragment noticesFragment=new NoticesFragment();
                        fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.home_frame,noticesFragment);
                        fragmentTransaction1.commit();
                        Toast.makeText(getApplicationContext(),"Announcements Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.add:
                        AddComplaintFragment addComplaintFragment=new AddComplaintFragment();
                        fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.home_frame,addComplaintFragment);
                        fragmentTransaction1.commit();
                        Toast.makeText(getApplicationContext(),"Add Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.notification:
                        NotificationsFragment notificationsFragment=new NotificationsFragment();
                        fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.home_frame,notificationsFragment);
                        fragmentTransaction1.commit();
                        Toast.makeText(getApplicationContext(),"Notification Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.profile:
                        MyProfileFragment myProfileFragment=new MyProfileFragment();
                        fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction1.replace(R.id.home_frame,myProfileFragment);
                        fragmentTransaction1.commit();
                        Toast.makeText(getApplicationContext(),"profile Clicked",Toast.LENGTH_SHORT).show();
                        break;
                }


                return true;
            }

        });

    }
}
