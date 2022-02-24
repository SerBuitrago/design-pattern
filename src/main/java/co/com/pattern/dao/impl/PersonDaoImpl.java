package co.com.pattern.dao.impl;

import co.com.pattern.dao.PersonDao;
import co.com.pattern.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static co.com.util.Data.PERSON_FLUX;

public class PersonDaoImpl implements PersonDao {

    @Override
    public Mono<Person> findById(Integer id) {
        if(id == null || id <= 0)
            return Mono.error(new RuntimeException("Error id person."));
        return PERSON_FLUX
                .filter(person -> person.getId() == id)
                .singleOrEmpty()
                .defaultIfEmpty(new Person())
                .flatMap(person -> {
                    if(person.getId() == null)
                        return Mono.error(new Exception(String.format("Not find person id %s", id)));
                    return Mono.just(person);
                });
    }

    @Override
    public Flux<Person> findAll() {
        return PERSON_FLUX;
    }

    @Override
    public Mono<Person> save(Person person) {
        PERSON_FLUX = Flux.merge(PERSON_FLUX, Flux.just(person));
        PERSON_FLUX.subscribe();
        return Mono.just(person);
    }

    @Override
    public Mono<Person> update(Person person) {
        removeById(person.getId());
        return save(person);
    }

    @Override
    public void removeById(Integer id) {
        PERSON_FLUX
                .filter(person -> person.getId() != id)
                .subscribe();
    }
}
