package co.com.pattern.type.rest.impl;

import co.com.pattern.type.rest.IRest;

public class RestNoArea implements IRest {

    @Override
    public void read(String path) {
        System.out.println("Error Not Area");
    }
}
