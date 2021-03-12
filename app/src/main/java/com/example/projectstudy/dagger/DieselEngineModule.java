package com.example.projectstudy.dagger;

import com.example.projectstudy.car.DieselEngine;
import com.example.projectstudy.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine dieselEngine);
}
