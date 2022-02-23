package co.com.pattern.type.rest.impl;

import co.com.pattern.type.rest.IRest;

public class RestBuy implements IRest {

    @Override
    public void read(String path) {
        System.out.println("Area Buy: ".concat(path));
    }
}
