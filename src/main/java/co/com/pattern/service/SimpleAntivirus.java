package co.com.pattern.service;

import co.com.pattern.strategy.impl.SimpleAnalysis;

public class SimpleAntivirus extends SimpleAnalysis {
    @Override
    public void start() {
        System.out.println("Simple Antivirus - Start!");
    }

    @Override
    public void skipZip() {
        try {
            System.out.print("\tAnalyzing (.zip)");
            for(int point = 0; point<3; point++){
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println("\n\t\tError parsing '.zip' files.");
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("Simple Antivirus - Stop!");
    }
}
