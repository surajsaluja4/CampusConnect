package com.example.hp.campusconnect;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(getApplicationContext(),"Home Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.announcement:
                        Toast.makeText(getApplicationContext(),"Announcements Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.add:
                        Toast.makeText(getApplicationContext(),"Add Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.notification:
                        Toast.makeText(getApplicationContext(),"Notification Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(),"profile Clicked",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }

        });

    }
}
