package com.example.outfitpickerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;



public class homepage extends AppCompatActivity {

    EditText email, password;
    TextView signin, register, forgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextPassword);


        signin = findViewById(R.id.textView8);
        register = findViewById(R.id.textView1);
        forgotPassword = findViewById(R.id.textView7);


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userEmail = email.getText().toString().trim();
                String userPassword = password.getText().toString().trim();

                if (userEmail.equals("awabiftikhar123@gmail.com")
                        && userPassword.equals("1234")) {

                    Toast.makeText(homepage.this,
                            "Login Successful",
                            Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(homepage.this, Dresspage.class);
                    startActivity(i);
                    finish();
                } else {

                    Toast.makeText(homepage.this,
                            "Invalid Email or Password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Register Button
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(homepage.this,
                        "Register Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Forgot Password
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(homepage.this,
                        "Forgot Password Clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}