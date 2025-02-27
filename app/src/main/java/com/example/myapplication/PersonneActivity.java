package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonneActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setGravity(
                
        );

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null) {
            String email = bundle.getString("email");
            String motdepasse = bundle.getString("motdepasse");

            textView.setText("E-mail: " + email + " et mot de passe : " + motdepasse);
        }
        
        

        setContentView(textView);
    }
}

