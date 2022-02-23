package co.com.design;

import co.com.pattern.IAccount;
import co.com.pattern.impl.AccountSavingsImpl;
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
		AccountSavingsImpl account = new AccountSavingsImpl();
		account.setAmount(100.000D);

		AccountSavingsImpl accountClone = (AccountSavingsImpl) account.cloneAccount();

		System.out.println(account);
		System.out.println(accountClone);

		System.out.println(account == accountClone);
	}

}
