package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
    private Button signupbutton;
    private Button signinbutton;
    private EditText email;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().hide();

        signupbutton = (Button) findViewById(R.id.button);
        signinbutton = (Button) findViewById(R.id.button2);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SignIn.this, SignUp.class);
                startActivity(intent);
            }
        });

        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = findViewById(R.id.editTextTextEmailAddress);
                password = findViewById(R.id.etPasswordLayout);

                if(email.getText().toString().length()==0)
                {
                    email.setError("Please Enter your email address");
                }
                else if(password.getText().toString().length()==0)
                {
                    password.setError("Please Enter your password");
                }
                else
                {
                    Intent intent =new Intent(SignIn.this, home.class);
                    startActivity(intent);
                }
            }
        });

    }
}