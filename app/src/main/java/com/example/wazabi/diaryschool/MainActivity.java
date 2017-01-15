package com.example.wazabi.diaryschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.wazabi.diaryschool.adapter.TabsFragmentAdapter;

import static com.example.wazabi.diaryschool.R.id.activity_shedule;

public class MainActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_main;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        intiNavigationView();
        initTabs();


    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.Diary);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);
    }



    private void initTabs() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabsFragmentAdapter adapter = new TabsFragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void intiNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.view_navigation_open, R.string.view_navigation_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                switch (item.getItemId()) {
                    case R.id.actionNotificationItem:
                        showNoteficationTab();
                        break;
                    case R.id.actionSettingItem:
                        showSettingTab();
                        break;
                    case R.id.actionExitItem:
                        showExitTab();
                        break;
                }
                return true;
            }
        });
    }

    private void showExitTab() {
        Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show();
    }

    private void showSettingTab() {
        Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show();
    }

    private void showNoteficationTab() {
        viewPager.setCurrentItem(Constants.TAB_ONE);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Shedule.class);
        switch (view.getId()){
            case R.id.btnMonday:
                startActivity(intent);
                break;
            case R.id.btnTuesday:
                startActivity(intent);
                break;
            case R.id.btnWednesday:
                startActivity(intent);
                break;
            case R.id.btnThursday:
                startActivity(intent);
                break;
            case R.id.btnFriday:
                startActivity(intent);
                break;
            case R.id.btnSaturday:
                startActivity(intent);
                break;
        }
    }


}
