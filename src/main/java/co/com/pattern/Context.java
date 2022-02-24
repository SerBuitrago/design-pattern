package co.com.pattern;

import co.com.pattern.strategy.IStrategy;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Context {

    private final IStrategy strategy;

    public void execute(){
        strategy.analyze();
    }
}
