package com.example.hp.campusconnect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener, RegisterFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().add(R.id.main_frame_layout, new LoginFragment()).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }

    public void signUp(View view) {
        getFragmentManager().beginTransaction().replace(R.id.main_frame_layout, new RegisterFragment()).commit();
    }
}