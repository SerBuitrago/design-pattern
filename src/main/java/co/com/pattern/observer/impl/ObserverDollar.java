package co.com.pattern.observer.impl;

import co.com.pattern.subject.Subject;
import co.com.pattern.observer.Observer;
import reactor.core.publisher.Mono;

public class ObserverDollar extends Observer {

    private Double value = 3.25;

    public ObserverDollar(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        Mono.just(subject.getStatus() * value)
                .doOnNext(value -> System.out.println(String.format("\tDOLLAR: %s", value)))
                .subscribe();
    }
}
