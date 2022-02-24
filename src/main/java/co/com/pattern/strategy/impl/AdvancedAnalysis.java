package co.com.pattern.strategy.impl;

import co.com.pattern.strategy.IStrategy;

public abstract class AdvancedAnalysis implements IStrategy {

    @Override
    public void analyze() {
        start();
        analyzeMemory();
        analyzeKeyLoggers();
        analyzeRootKits();
        decompressZip();
        stop();
    }

    public abstract void start();

    public abstract void analyzeMemory();

    public abstract void analyzeKeyLoggers();

    public abstract void analyzeRootKits();

    public abstract void decompressZip();

    public abstract void stop();
}
