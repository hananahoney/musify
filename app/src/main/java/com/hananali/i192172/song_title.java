package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class song_title extends AppCompatActivity {
    private ImageButton back_button;
    private ImageButton add_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_title);

        back_button = (ImageButton) findViewById(R.id.back_button);
        add_ = (ImageButton) findViewById(R.id.add);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                song_title.this.finish();
            }
        });

        add_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(song_title.this, add_main.class);
                startActivity(intent);
            }
        });
    }
}