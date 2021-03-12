package com.example.projectstudy.dagger;

import com.example.projectstudy.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
