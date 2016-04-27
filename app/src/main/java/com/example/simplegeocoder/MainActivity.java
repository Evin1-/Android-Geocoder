package com.example.simplegeocoder;

import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    private static final String SEARCH_ADDRESS = "3301 Windy Ridge Parkway";
    private static final int MAX_RESULTS = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Geocoder geocoder = new Geocoder(this, Locale.getDefault());
            List<Address> addresses = geocoder.getFromLocationName(SEARCH_ADDRESS, MAX_RESULTS);
            for (Address address : addresses) {
                Log.d(TAG, "onCreate: " + address);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
