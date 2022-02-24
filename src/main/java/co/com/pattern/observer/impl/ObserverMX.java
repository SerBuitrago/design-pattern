package co.com.pattern.observer.impl;

import co.com.pattern.observer.Observer;
import co.com.pattern.subject.Subject;
import reactor.core.publisher.Mono;

public class ObserverMX extends Observer {

    private Double value = 19.07;

    public ObserverMX(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        Mono.just(subject.getStatus() * value)
                .doOnNext(value -> System.out.println(String.format("\tMX: %s", value)))
                .subscribe();
    }
}
