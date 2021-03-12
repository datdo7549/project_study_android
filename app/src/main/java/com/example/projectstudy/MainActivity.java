package com.example.projectstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projectstudy.car.Car;
import com.example.projectstudy.dagger.CarComponent;
import com.example.projectstudy.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();
    }
}