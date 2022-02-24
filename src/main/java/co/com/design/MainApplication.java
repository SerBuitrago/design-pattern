package co.com.design;


import co.com.pattern.dao.PersonDao;
import co.com.pattern.dao.impl.PersonDaoImpl;
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
		PersonDao dao = new PersonDaoImpl();
		dao.findAll().doOnNext(System.out::println).subscribe();

		dao.findById(12).doOnNext(System.out::println).onErrorResume(error -> {
			System.out.println(error.getMessage());
			return Mono.empty();
		}).subscribe();
	}
}
