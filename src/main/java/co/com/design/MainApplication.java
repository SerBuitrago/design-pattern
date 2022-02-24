package co.com.design;

import co.com.pattern.Context;
import co.com.pattern.service.AdvancedAntivirus;
import co.com.pattern.service.SimpleAntivirus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	public static void main(String [] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("========================================");
		Context context = new Context(new SimpleAntivirus());
		context.execute();
		System.out.println("========================================");
		System.out.println("\n\n========================================");
		context = new Context(new AdvancedAntivirus());
		context.execute();
		System.out.println("========================================");
	}
}
