package com.example.projectstudy.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject
    public Engine engine;
    @Inject
    public Wheels wheels;

    @Inject
    public Car() {
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }
}
