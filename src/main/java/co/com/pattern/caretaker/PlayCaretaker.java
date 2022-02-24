package co.com.pattern.caretaker;

import co.com.pattern.memento.PlayMemento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PlayCaretaker {

    private Flux<PlayMemento> playMementoFlux = Flux.empty();

    public void addMemento(PlayMemento playMemento){
        playMementoFlux = Flux.merge(playMementoFlux, Flux.just(playMemento));
        playMementoFlux.subscribe();
    }

    public Mono<PlayMemento> getMemento(Integer index){
        return playMementoFlux
                .collectList()
                .flatMap(aux -> {
                    if(index >= aux.size())
                        return Mono.empty();
                    return Mono.just(aux.get(index));
                });
    }
}
