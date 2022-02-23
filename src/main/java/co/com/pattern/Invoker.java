package co.com.pattern;

import co.com.pattern.operation.IOperation;
import reactor.core.publisher.Flux;

public class Invoker {

    private Flux<IOperation> operationsFlux = Flux.empty();

    public void add(IOperation operation){
        operationsFlux = Flux.merge(operationsFlux, Flux.just(operation));
        operationsFlux.subscribe();
    }

    public  void perform(){
        operationsFlux
                .doOnNext(operation -> operation.execute())
                .subscribe();
        operationsFlux = Flux.empty();
    }
}
