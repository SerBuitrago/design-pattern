package co.com.pattern.service;


import co.com.pattern.strategy.impl.AdvancedAnalysis;

public class AdvancedAntivirus extends AdvancedAnalysis {
    @Override
    public void start() {
        System.out.println("Advanced Antivirus - Start!");
    }

    @Override
    public void analyzeMemory() {
        try {
            System.out.print("\tAnalyzing Memory");
            for(int point = 0; point<3; point++){
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println("\n\t\tSuccess Analyzing Memory.");
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void analyzeKeyLoggers() {
        try {
            System.out.print("\tAnalyzing Key Loggers");
            for(int point = 0; point<3; point++){
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println("\n\t\tSuccess Analyzing Key Loggers.");
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void analyzeRootKits() {
        try {
            System.out.print("\tAnalyzing Root Kits");
            for(int point = 0; point<3; point++){
                System.out.print(".");
                Thread.sleep(1000);
            }
            System.out.println("\n\t\tSuccess Root Kits.");
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void decompressZip() {
        Integer size = 3;
        try {
            for(int index = 0; index<size; index++){
                System.out.print("\tAnalyzing (.zip)");
                for(int point = 0; point<3; point++){
                    System.out.print(".");
                    Thread.sleep(1000);
                }
                if(1+index < size)
                    System.out.print("\n");
                Thread.sleep(1000);
            }
            System.out.println("\n\t\tSuccess parsing '.zip' files.");
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("Advanced Antivirus - Stop!");
    }
}
