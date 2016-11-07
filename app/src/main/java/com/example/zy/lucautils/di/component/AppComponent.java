package com.example.zy.lucautils.di.component;


import com.example.zy.lucautils.app.App;
import com.example.zy.lucautils.di.module.AppModule;
import com.example.zy.lucautils.di.scope.ContextLife;
import com.example.zy.lucautils.model.http.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    @ContextLife("Application")
    App getContext();  // 提供App的Context

    RetrofitHelper retrofitHelper();  //提供http的帮助类

//    RealmHelper realmHelper();    //提供数据库帮助类

}
