package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.Appliance;
import java.Habitat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnapp);

        ListView listView = findViewById(R.id.list_item);

        // appliances
        Appliance appliance1 = new Appliance(1,"machine_laver", 500, "600H");
        Appliance appliance2 = new Appliance(2,"aspirateur", 300, "7800H");
        Appliance appliance3 = new Appliance(3,"fer_a_repasser", 250, "800H");
        Appliance appliance4 = new Appliance(4,"climatiseur", 1500, "9600H");

        List<Appliance> appliances1 = new ArrayList<>();
        appliances1.add(appliance1);
        appliances1.add(appliance2);
        appliances1.add(appliance3);
        appliances1.add(appliance4);

        List<Appliance> appliances2 = new ArrayList<>();
        appliances2.add(appliance1);
        appliances2.add(appliance2);

        List<Appliance> appliances3 = new ArrayList<>();
        appliances3.add(appliance1);
        appliances3.add(appliance2);

        List<Appliance> appliances4 = new ArrayList<>();
        appliances4.add(appliance1);
        appliances4.add(appliance2);

        List<Appliance> appliances5 = new ArrayList<>();
        appliances5.add(appliance1);
        appliances5.add(appliance2);

        List<Habitat> habitants = new ArrayList<>();

        habitants.add(new Habitat(1, "Gaëtan LeClair", 1, 500.0,appliances1));
        habitants.add(new Habitat(2, "Cédric Boudet", 1, 500.0,appliances2));
        habitants.add(new Habitat(1, "Gaylord Thibodeaux", 2, 500.0,appliances3));
        habitants.add(new Habitat(2, "Adam Jacquinot", 3, 500.0,appliances4));
        habitants.add(new Habitat(2, "Abel Fresnel", 3, 500.0,appliances5));

        HabitatAdapter adapter = new HabitatAdapter(MainActivity.this, R.layout.item_habitat, habitants);

        listView.setAdapter(adapter);
    }
}