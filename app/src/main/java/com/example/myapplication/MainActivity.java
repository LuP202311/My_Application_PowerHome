package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Checkable;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ActionBarDrawerToggle toggle;
    FragmentManager fm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DrawerLayout drawerDL = findViewById(R.id.drawer);
        NavigationView navNV = findViewById(R.id.nav_view);
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
        return false;
    }
}
