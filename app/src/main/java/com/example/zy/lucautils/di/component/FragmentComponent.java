package com.example.zy.lucautils.di.component;

import android.app.Activity;


import com.example.zy.lucautils.di.module.FragmentModule;
import com.example.zy.lucautils.di.scope.FragmentScope;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

    Activity getActivity();

//    void inject(DailyFragment dailyFragment);

}
