package co.com.design;

import co.com.pattern.PlayOriginator;
import co.com.pattern.caretaker.PlayCaretaker;
import co.com.pattern.model.Play;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;


@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	private final String NAME = "Sergio Stives Barrios Buitrago";
	private final Integer CHECK_POINT=  1;

	private Integer INCREMENT = CHECK_POINT;

	public static void main(String [] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mono<Play> playMono = Mono.just(Play.builder().name(NAME).checkPoint(INCREMENT).build());

		PlayCaretaker caretaker = new PlayCaretaker();
		PlayOriginator originator = new PlayOriginator();

		increment(playMono, originator);
		increment(playMono, originator);

		caretaker.addMemento(originator.save().block());

		increment(playMono, originator);
		originator.restore(caretaker.getMemento(0).block());

		playMono = Mono.just(originator.getStatu());
		System.out.println(playMono.block());

	}

	public void increment(Mono<Play> playMono, PlayOriginator originator){
		INCREMENT++;
		playMono = Mono.just(Play.builder().name(NAME).checkPoint(INCREMENT).build());
		originator.setStatu(playMono.block());
	}
}
