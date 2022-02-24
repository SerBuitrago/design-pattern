package co.com.pattern.memento;

import co.com.pattern.model.Play;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayMemento {
    private final Play statu;
}
