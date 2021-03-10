package com.example.projectstudy;

import dagger.Component;

@Component
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
