package co.com.pattern.subject;

import co.com.pattern.observer.Observer;

import lombok.Getter;
import lombok.ToString;

import reactor.core.publisher.Flux;

@Getter
@ToString
public class Subject {

    private Flux<Observer> observers = Flux.empty();
    private Integer status;

    public void setStatus(Integer status){
        this.status = status;
        notification();
    }

    public void add(Observer observer){
        observers = Flux.merge(observers, Flux.just(observer));
        observers.subscribe();
    }

    public void notification(){
        observers
                .doOnNext(observer -> observer.update())
                .subscribe();
    }
}
