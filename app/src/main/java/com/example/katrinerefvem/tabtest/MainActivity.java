package com.example.katrinerefvem.tabtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class MainActivity extends Activity {

Tab tab1, tab2,tab3;
    Fragment fragmentTab1 = new FragmentTab1();
    Fragment fragmentTab2 = new FragmentTab2();
    Fragment fragmentTab3 = new FragmentTab3();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ActionBar actionBar = getActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tab1 = actionBar.newTab().setText("1");
        tab2 = actionBar.newTab().setText("2");
        tab3 = actionBar.newTab().setText("3");

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);

        tab1.setTabListener(new MyTabListener(fragmentTab1));
        tab2.setTabListener(new MyTabListener(fragmentTab2));
        tab3.setTabListener(new MyTabListener(fragmentTab3));
    }

       private class MyTabListener implements TabListener
       {
            Fragment fragment;

            public MyTabListener(Fragment fragment)
            {
                this.fragment = fragment;
            }

            public void onTabReselected(Tab tab, FragmentTransaction ft)
            {
            }
            public void onTabSelected(Tab tab,FragmentTransaction ft)
            {
              ft.replace(R.id.action_bar_container,fragment);

            }

            public void onTabUnselected(Tab tab,FragmentTransaction ft)
            {
               ft.remove(fragment);


            }
        }

}