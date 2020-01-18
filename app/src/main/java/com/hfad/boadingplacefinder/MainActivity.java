package com.hfad.boadingplacefinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signin = (Button) findViewById(R.id.signin);
        Button signup = (Button) findViewById(R.id.signup);
        Button find = (Button) findViewById(R.id.find);


        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intentSignIn = new Intent(getApplicationContext(), SignInActivity.class);
                startActivity(intentSignIn);

            }
        });

        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intentSignUp = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intentSignUp);

            }
        });

        find.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intentFind = new Intent(getApplicationContext(), FindActivity.class);
                startActivity(intentFind);

            }
        });


    }


}
