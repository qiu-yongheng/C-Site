package com.example.castle.csite.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.castle.csite.R;
import com.example.castle.csite.ui.adapter.HomeAdapter;

/**
 * Created by castle on 16-9-21.
 */
public class HomeFragment extends Fragment{
    TabLayout mTabLayout;

    ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mycollect, container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.view_pager);
        mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        mViewPager.setAdapter(new HomeAdapter(getFragmentManager()));
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
