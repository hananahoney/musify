package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class main_home extends AppCompatActivity {

//    DrawerLayout drawerLayout;
//    NavigationView navigationview;
//    Toolbar toolbar;
    private Button songbar;
    private ImageButton add_;
    private ImageButton search_;
    private ImageButton liked_;
    private ImageButton listen_later_;
    private ImageButton profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        setContentView(R.layout.activity_main_home);

        songbar = (Button) findViewById(R.id.song_bar);
        add_ = (ImageButton) findViewById(R.id.add);
        search_ = (ImageButton) findViewById(R.id.search);
        liked_ = (ImageButton) findViewById(R.id.like);
        profile = (ImageButton) findViewById(R.id.profile);
        listen_later_ = (ImageButton) findViewById(R.id.listen_later);

        songbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(main_home.this, song_title.class);
                startActivity(intent);
            }
        });

        add_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(main_home.this, add_main.class);
                startActivity(intent);
            }
        });
        search_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(main_home.this, serach_page.class);
                startActivity(intent);
            }
        });

        liked_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(main_home.this, liked_music.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(main_home.this, profile_page.class);
                startActivity(intent);
            }
        });

        listen_later_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(main_home.this, listen_later_music.class);
                startActivity(intent);
            }
        });

//        drawerLayout = findViewById(R.id.drawer_view);
//        navigationview = findViewById(R.id.nav_view);
//        toolbar = findViewById(R.id.toolbar2);
//
//        setSupportActionBar(toolbar);
    }
}