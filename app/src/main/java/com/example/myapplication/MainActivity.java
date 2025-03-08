package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import com.example.myapplication.fragments.HabitatsFragment;
import com.example.myapplication.fragments.MesRequetesFragment;
import com.example.myapplication.fragments.MonHabitatFragment;
import com.example.myapplication.fragments.ParametresFragment;
import com.example.myapplication.fragments.SeDeconnecterFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ActionBarDrawerToggle toggle;
    FragmentManager fm;
    DrawerLayout drawerDL;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerDL = findViewById(R.id.drawer);
        NavigationView navNV = findViewById(R.id.nav_view);
        View headerView = navNV.getHeaderView(0);
        TextView userName = headerView.findViewById(R.id.user_name);
        ImageView profileImage = headerView.findViewById(R.id.image_profile);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null) {
            String email = bundle.getString("email");
            userName.setText(email);
        }

        toggle =
                new ActionBarDrawerToggle(this, drawerDL,
                        R.string.open, R.string.close);
        drawerDL.setDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fm = getSupportFragmentManager();
        navNV.setNavigationItemSelectedListener(this);
        navNV.getMenu().performIdentifierAction(R.id.habitats, 0);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return toggle.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.habitats){
            fm.beginTransaction().replace(R.id.contentFL,
                    new HabitatsFragment()).commit();
        } else if (item.getItemId() == R.id.monHabitat) {
            fm.beginTransaction().replace(R.id.contentFL,
                    new MonHabitatFragment()).commit();
        } else if (item.getItemId() == R.id.mesRequetes) {
            fm.beginTransaction().replace(R.id.contentFL,
                    new MesRequetesFragment()).commit();
        } else if (item.getItemId() == R.id.parametres) {
            fm.beginTransaction().replace(R.id.contentFL,
                    new ParametresFragment()).commit();
        } else if (item.getItemId() == R.id.seDeconnecter) {
            fm.beginTransaction().replace(R.id.contentFL,
                    new SeDeconnecterFragment()).commit();
        }
        drawerDL.closeDrawer(GravityCompat.START);
        return true;
    }
}
