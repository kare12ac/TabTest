package com.example.katrinerefvem.tabtest;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class FragmentTab2 extends Fragment {

public View onCreateView (LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)

{
    View view = inflater.inflate(R.layout.activity_fragment_tab2, container,false);

    return view;

}
}