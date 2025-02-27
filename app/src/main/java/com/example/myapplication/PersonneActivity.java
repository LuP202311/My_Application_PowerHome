package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonneActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null) {
            String email = bundle.getString("email");
            String motdepasse = bundle.getString("motdepasse");

            textView.setText("E-mail: " + email + " et mot de passe : " + motdepasse);
        }

        Button btn = new Button(this);
        btn.setText("Liste des habitants");
        btn.setGravity(Gravity.CENTER);

        setContentView(textView);
        setContentView(btn);
    }
}

