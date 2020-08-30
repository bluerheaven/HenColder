package com.example.app.entity;

import com.example.core.BaseApplication;
import com.example.core.utils.Utils;

public class A {
    public static void main(String[] args) {
        BaseApplication.currentApplication();

        Utils.INSTANCE.toast("a");
    }
}
