package co.com.design;

import co.com.pattern.facade.CheckFacade;
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
		CheckFacade client1 = new CheckFacade();
		client1.search("23-02-2022", "23-03-2022", "Cucuta/Colombia", "Amsterdam/Netherlands");

		CheckFacade client2 = new CheckFacade();
		client2.search("24-02-2022", "28-02-2022", "Medellin/Colombia", "Cucuta/Colombia");
	}

}
