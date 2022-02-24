package co.com.pattern.dao;

import co.com.pattern.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonDao {

    Mono<Person> findById(Integer id);

    Flux<Person> findAll();

    Mono<Person> save(Person person);

    Mono<Person> update(Person person);

    void removeById(Integer id);
}
