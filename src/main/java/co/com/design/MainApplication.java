package co.com.design;

import co.com.pattern.decorator.ArmorDecorator;
import co.com.pattern.model.Account;
import co.com.pattern.service.IAccount;
import co.com.pattern.service.impl.AccountSaving;
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
		Account accountModel = Account.builder().id(1).client("Sergio Stives Barrios Buitrago").build();

		IAccount account = new AccountSaving();
		IAccount accountArmor = new ArmorDecorator(account);
		
		accountArmor.open(accountModel);
	}
}
