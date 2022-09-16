package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class main_home extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationview;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

//        drawerLayout = findViewById(R.id.drawer_view);
//        navigationview = findViewById(R.id.nav_view);
//        toolbar = findViewById(R.id.toolbar2);
//
//        setSupportActionBar(toolbar);
    }
}