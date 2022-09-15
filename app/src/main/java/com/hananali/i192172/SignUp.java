package com.hananali.i192172;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {
    private Button signinbutton;
    private Button signupbutton;

    private EditText name;
    private EditText email;
    private EditText password;
    private RadioButton male;
    private RadioButton female;
    private RadioButton other;
    private CheckBox check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        signinbutton = (Button) findViewById(R.id.button);
        signupbutton = (Button) findViewById(R.id.button2);
        male = (RadioButton) findViewById(R.id.radioButton4);
        female = (RadioButton) findViewById(R.id.radioButton5);
        other = (RadioButton) findViewById(R.id.radioButton6);
        check = (CheckBox) findViewById(R.id.checkBox2);

        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(SignUp.this, SignIn.class);
                startActivity(intent);
            }
        });

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = findViewById(R.id.editTextTextPersonName2);
                email = findViewById(R.id.editTextTextEmailAddress);
                password = findViewById(R.id.etPasswordLayout);

                if(name.getText().toString().length()==0)
                {
                    name.setError("Please Enter your name.");
                }
                else if(email.getText().toString().length()==0)
                {
                    email.setError("Please Enter your email address.");
                }
                else if(password.getText().toString().length()==0)
                {
                    password.setError("Please Enter your password.");
                }
                else if(!male.isChecked() && !female.isChecked() && !other.isChecked())
                {
                    other.setError("Please select your gender.");
                }
                else if(!check.isChecked())
                {
                    check.setError("Please agree to our terms and conditions.");
                }
                else
                {
                    Intent intent =new Intent(SignUp.this, SignIn.class);
                    startActivity(intent);
                }
            }
        });
    }
}