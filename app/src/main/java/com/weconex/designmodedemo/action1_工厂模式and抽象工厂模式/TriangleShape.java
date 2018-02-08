package com.weconex.designmodedemo.action1_工厂模式and抽象工厂模式;

import android.util.Log;

/**
 * Created by lifeng on 2018/1/31.
 */

public class TriangleShape implements Shape {
    public TriangleShape() {
        Log.i("TAG", "TriangleShape:创建");
    }

    @Override
    public void draw() {
        Log.i("TAG", "TriangleShape:draw");
    }
}
