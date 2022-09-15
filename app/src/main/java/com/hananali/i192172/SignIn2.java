package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn2 extends AppCompatActivity {
    private Button signinbutton;
    private Button create_account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in2);

        getSupportActionBar().hide();

        signinbutton = (Button) findViewById(R.id.button);
        create_account = (Button) findViewById(R.id.etPasswordLayout);

        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SignIn2.this, SignIn.class);
                startActivity(intent);
            }
        });

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SignIn2.this, SignUp.class);
                startActivity(intent);
            }
        });



    }
}