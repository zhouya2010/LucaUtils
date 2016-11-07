package com.example.zy.lucautils.di.component;

import android.app.Activity;


import com.example.zy.lucautils.di.module.ActivityModule;
import com.example.zy.lucautils.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

//    void inject(WelcomeActivity welcomeActivity);

}
