package co.com.pattern.strategy.impl;

import co.com.pattern.strategy.IStrategy;

public abstract class SimpleAnalysis implements IStrategy {

    @Override
    public void analyze() {
        start();
        skipZip();
        stop();
    }

    public abstract void start();

    public abstract  void skipZip();

    public abstract void stop();
}
