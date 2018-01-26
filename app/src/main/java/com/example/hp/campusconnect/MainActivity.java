package com.example.hp.campusconnect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements SelectUser.OnFragmentInteractionListener, LoginFragment.OnFragmentInteractionListener, RegisterFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().add(R.id.main_frame_layout, new SelectUser()).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void login(View view) {
        this.finish();
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
    }

    public void signUp(View view) {
        getFragmentManager().beginTransaction().replace(R.id.main_frame_layout, new RegisterFragment()).addToBackStack(null).commit();
    }

    public void selectUser(View view) {
        getFragmentManager().beginTransaction().replace(R.id.main_frame_layout, new LoginFragment()).addToBackStack(null).commit();
    }
}