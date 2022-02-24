package co.com.pattern;

import co.com.pattern.memento.PlayMemento;
import co.com.pattern.model.Play;
import lombok.Data;
import reactor.core.publisher.Mono;

@Data
public class PlayOriginator {

    private Play statu;

    public Mono<PlayMemento> save(){
        return Mono.just(new PlayMemento(statu));
    }

    public void restore(PlayMemento playMemento){
        this.statu = Mono.just(playMemento)
                         .flatMap(play -> Mono.just(play.getStatu()))
                         .block();
    }
}
