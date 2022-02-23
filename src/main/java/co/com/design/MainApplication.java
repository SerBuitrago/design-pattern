package co.com.design;

import co.com.pattern.Connection;

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
		Connection connection = Connection.getConnection();

		connection.connection();
		connection.disconnect();

		boolean instance = connection instanceof Connection;
		System.out.println("Instance: ".concat(String.valueOf(instance)));
	}
}
