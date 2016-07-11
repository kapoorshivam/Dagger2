package com.shivam.daggerandsharepref;

import android.app.Application;

import com.shivam.daggerandsharepref.component.DaggerStorageComponent;
import com.shivam.daggerandsharepref.component.StorageComponent;
import com.shivam.daggerandsharepref.module.StorageModule;

public class MyApplication extends Application {

    StorageComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerStorageComponent
                .builder()
                .storageModule(new StorageModule(this))
                .build();
    }

    public StorageComponent getComponent() {
        return component;
    }
}
