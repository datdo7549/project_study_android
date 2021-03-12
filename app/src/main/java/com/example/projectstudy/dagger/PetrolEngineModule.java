package com.example.projectstudy.dagger;

import com.example.projectstudy.car.Engine;
import com.example.projectstudy.car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }
}
