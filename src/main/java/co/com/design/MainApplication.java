package co.com.design;

import co.com.pattern.observer.impl.ObserverCO;
import co.com.pattern.observer.impl.ObserverDollar;
import co.com.pattern.observer.impl.ObserverMX;
import co.com.pattern.subject.Subject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	public static void main(String [] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Mono.just(new Subject())
				.flatMap(subject -> {
					new ObserverMX(subject);
					new ObserverCO(subject);
					new ObserverDollar(subject);
					return Mono.just(subject);})
				.doOnNext(subject -> execute(10, subject))
				.doOnNext(subject -> execute(100, subject))
				.doOnNext(subject -> execute(200, subject))
				.subscribe();
	}

	private void execute(Integer value, Subject subject){
		System.out.println("\n=======================================================");
		System.out.println(String.format("If you want to change %s dollars you will get", value));
		System.out.println("-------------------------------------------------------");
		subject.setStatus(value);
		System.out.println("=======================================================");
	}
}
