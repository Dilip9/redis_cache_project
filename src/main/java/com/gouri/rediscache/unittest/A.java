package com.gouri.rediscache.unittest;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

    @Autowired
    private B b;

    public int sum(int x, int y) {
        if(x<y) return b.check(x, y);
        else return b.check(x, y);
    }
}
