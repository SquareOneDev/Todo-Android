package com.squareonedev.todolist;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class tab1todo extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1todo, container, false);


        String[] list = {"hola" , "jp puto", "jp + puto"};
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());//LinearLayoutManager(this);
        RecyclerView txt = (RecyclerView) rootView.findViewById(R.id.main_list);
        txt.setLayoutManager(linearLayoutManager);


        for (int i=0; i<list.length;i++) {

            for (int j = 0; j < list.length; j++) {
                //txt.(list[j]);


            }
        }


        return rootView;
    }
}
