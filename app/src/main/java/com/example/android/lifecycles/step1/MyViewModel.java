package com.example.android.lifecycles.step1;

import android.arch.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    public MyViewModel() {
        super();
    }

    private Long mBase;

    Long getBase() {
        return mBase;
    }

    void setBase(Long base) {
        mBase = base;
    }
}
