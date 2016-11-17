package com.example.zy.lucautils.ui.activity;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.zy.lucautils.R;
import com.example.zy.lucautils.app.Constants;
import com.example.zy.lucautils.base.SimpleActivity;
import com.example.zy.lucautils.ui.fragmen.DailyFragment;
import com.example.zy.lucautils.ui.fragmen.HotFragment;
import com.example.zy.lucautils.ui.fragmen.SectionFragment;
import com.example.zy.lucautils.ui.fragmen.ThemeFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportFragment;

public class MainActivity extends SimpleActivity {


    @BindView(R.id.navigation_bar)
    BottomNavigationView navigationBar;
    @BindView(R.id.fl_main_content)
    FrameLayout flMainContent;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    DailyFragment daily;
    HotFragment hot;
    SectionFragment section;
    ThemeFragment theme;

    List<Fragment> fragments = new ArrayList<Fragment>();

    private BottomSheetBehavior mBottomSheetBehavior;

    private int hideFragment = Constants.TYPE_DAILY;
    private int showFragment = Constants.TYPE_DAILY;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEventAndData() {

        setToolBar(toolbar, "LucaUtils");
        getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        daily = new DailyFragment();
        hot = new HotFragment();
        section = new SectionFragment();
        theme = new ThemeFragment();

        loadMultipleRootFragment(R.id.fl_main_content, 0, daily, hot, section, theme);

        navigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.search_btn:
                        showFragment = Constants.TYPE_DAILY;
                        Log.d("MainActivity", "search_btn");
                        break;
                    case R.id.list_btn:
                        showFragment = Constants.TYPE_HOT;
                        Log.d("MainActivity", "list_btn");
                        break;
                    case R.id.my_btn:
                        showFragment = Constants.TYPE_SECTION;
                        Log.d("MainActivity", "my_btn");
                        break;
                    case R.id.set_btn:
                        showFragment = Constants.TYPE_THEME;
                        Log.d("MainActivity", "set_btn");
                        break;
                }

                showHideFragment(getTargetFragment(showFragment), getTargetFragment(hideFragment));
                hideFragment = showFragment;
                return false;
            }
        });
    }

    private SupportFragment getTargetFragment(int item) {
        switch (item) {
            case Constants.TYPE_DAILY:
                return daily;
            case Constants.TYPE_HOT:
                return hot;
            case Constants.TYPE_SECTION:
                return section;
            case Constants.TYPE_THEME:
                return theme;
        }

        return daily;
    }

}
