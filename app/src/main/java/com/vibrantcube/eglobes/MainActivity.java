package com.vibrantcube.eglobes;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vibrantcube.eglobes.home.HomeFragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ActionBar toolbar;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_favorite:
                    mTextMessage.setText(R.string.title_favorite);
                    return true;
                case R.id.navigation_sell:
                    mTextMessage.setText(R.string.title_sell);
                    return true;
                case R.id.navigation_message:
                    mTextMessage.setText(R.string.title_message);
                    return true;

                case R.id.navigation_profile:
                    mTextMessage.setText(R.string.title_profile);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar = getSupportActionBar();

        // load the store fragment by default
        toolbar.setTitle("Home");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        // define your fragments here
        final Fragment homeFragment = new HomeFragment();
        final Fragment favoriteFragment = new FavoriteFragment();
        final Fragment sellFragment = new SellFragment();
        final Fragment messageFragment = new MessageFragment();
        final Fragment profileFragment = new ProfileFragment();

        // handle navigation selection
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment fragment;
                        switch (item.getItemId()) {
                            case R.id.navigation_sell:
                                toolbar.setTitle("Sell");
                                fragment = sellFragment;
                                break;

                            case R.id.navigation_favorite:
                                fragment = favoriteFragment;
                                toolbar.setTitle("Favorite");
                                break;

                            case R.id.navigation_message:
                                fragment = messageFragment;
                                toolbar.setTitle("Message");
                                break;

                            case R.id.navigation_profile:
                                fragment = profileFragment;
                                toolbar.setTitle("Profile");
                                break;
                            case R.id.navigation_home:
                                toolbar.setTitle("Search");
                            default:
                                fragment = homeFragment;
                                break;
                        }
                        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                        return true;
                    }
                });
        // Set default selection
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);
    }


}
