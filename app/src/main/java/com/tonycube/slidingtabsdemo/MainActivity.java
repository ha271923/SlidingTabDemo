package com.tonycube.slidingtabsdemo;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tonycube.slidingtabsdemo.fragment.TabFragment;


public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initToolbar();
        initTabFragment(savedInstanceState);
    }
    
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("SlidingTabs Demo");
    }

    private void initTabFragment(Bundle savedInstanceState){
        if (savedInstanceState == null) {
            TabFragment tabFragment = new TabFragment();

            getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.content_fragment, tabFragment)
                .commit();
        }
    }
    
}
