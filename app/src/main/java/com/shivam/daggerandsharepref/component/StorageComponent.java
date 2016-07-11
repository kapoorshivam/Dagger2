package com.shivam.daggerandsharepref.component;

import com.shivam.daggerandsharepref.module.StorageModule;
import com.shivam.daggerandsharepref.ui.fragments.FragmentA;
import com.shivam.daggerandsharepref.ui.fragments.FragmentB;

import javax.inject.Singleton;

import dagger.Component;

/*
 * The modules are those who provide dependencies, and components who inject them
 */

@Singleton
@Component(modules = StorageModule.class)
public interface StorageComponent {

    void inject(FragmentA fragmentA);

    void inject(FragmentB fragmentB);
}