package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class add_main extends AppCompatActivity {
    private Button add_playlist;
    private Button add_music;
    private ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_main);

        add_playlist = (Button) findViewById(R.id.add_playlist);
        add_music = (Button) findViewById(R.id.add_music);
        back = (ImageButton) findViewById(R.id.back_button);

        add_playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(add_main.this, add_playlist.class);
                startActivity(intent);
            }
        });
        add_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(add_main.this, upload_music.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add_main.this.finish();
            }
        });
    }
}