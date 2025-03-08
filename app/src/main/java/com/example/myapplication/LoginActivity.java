package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_connecter = findViewById(R.id.bouton_connecter);
        Button btn_inscrire = findViewById(R.id.bouton_inscrire);

        btn_connecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();

                EditText emailET = findViewById(R.id.email);
                EditText passwordET = findViewById(R.id.password);

                String email = emailET.getText().toString();
                String password = passwordET.getText().toString();

                bundle.putString("email", email);
                bundle.putString("motdepasse", password);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

//        btn_connecter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(LoginActivity.this, HabitatActivity.class);
//                startActivity(intent1);
//            }
//        });


//        btn_connecter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(intent1);
//            }
//        });


        btn_inscrire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent2);
            }
        });
    }
}
