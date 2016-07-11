package com.shivam.daggerandsharepref.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.shivam.daggerandsharepref.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/*
 *  The modules are those who provide dependencies, and components who inject them
 */

@Module
public class StorageModule {
    private final MyApplication application;

    public StorageModule(MyApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
}