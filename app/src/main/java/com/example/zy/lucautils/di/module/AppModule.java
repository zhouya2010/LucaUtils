package com.example.zy.lucautils.di.module;

import com.example.zy.lucautils.app.App;
import com.example.zy.lucautils.di.scope.ContextLife;
import com.example.zy.lucautils.model.http.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by codeest on 16/8/7.
 */

@Module
public class AppModule {
    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @ContextLife("Application")
    App provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    RetrofitHelper provideRetrofitHelper() {
        return new RetrofitHelper();
    }

//    @Provides
//    @Singleton
//    RealmHelper provideRealmHelper() {
//        return new RealmHelper(application);
//    }
}
