package com.tangxiaolv.simple.entity;

import com.tangxiaolv.router.interfaces.IRouter;

import java.util.List;

public class Package implements IRouter {

    private float f;
    private int i;
    private long l;
    private double d;
    private boolean b = true;
    private B bObj;
    private List<B> listB;

    public Package() {
    }

    public Package(float f, int i, long l, double d, boolean b, B bObj, List<B> listB) {
        this.f = f;
        this.i = i;
        this.l = l;
        this.d = d;
        this.b = b;
        this.bObj = bObj;
        this.listB = listB;
    }
}
