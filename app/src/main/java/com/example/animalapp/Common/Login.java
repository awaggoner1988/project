package com.example.animalapp.Common;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

import com.example.animalapp.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void callLoginBackButton(View view){

        Intent intent = new Intent(getApplicationContext(), SplashScreen.class);

        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<View, String>(findViewById(R.id.login_back_button), "transition_signup");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
        startActivity(intent, options.toBundle());
    }

    public void callSignupScreen(View view){

        Intent intent = new Intent(getApplicationContext(), Signup.class);

        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<View, String>(findViewById(R.id.login_signup_button), "transition_signup");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
        startActivity(intent, options.toBundle());
    }
}