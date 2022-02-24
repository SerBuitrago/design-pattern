package co.com.util;

import co.com.pattern.model.Person;
import reactor.core.publisher.Flux;

public class Data {

    public static Flux<Person> PERSON_FLUX = Flux.just(
            Person.builder().id(1).name("Sergio Stives Barrios Buitrago").build(),
            Person.builder().id(2).name("Jhonatan Javier Barrios Buitrago").build(),
            Person.builder().id(3).name("Claudia Buitrago Hernandez").build(),
            Person.builder().id(4).name("Rafel Gustavo Barrios Miranda").build(),
            Person.builder().id(5).name("Katherine Mendoza Vivaz").build()
    );
}
