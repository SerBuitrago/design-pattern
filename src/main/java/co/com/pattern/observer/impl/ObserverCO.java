package co.com.pattern.observer.impl;

import co.com.pattern.observer.Observer;
import co.com.pattern.subject.Subject;
import reactor.core.publisher.Mono;

public class ObserverCO extends Observer {

    private Double value = 23.05;

    public ObserverCO(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        Mono.just(subject.getStatus() * value)
                .doOnNext(value -> System.out.println(String.format("\tCO: %s", value)))
                .subscribe();
    }
}
