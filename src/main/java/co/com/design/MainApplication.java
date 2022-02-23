package co.com.design;


import co.com.pattern.model.Account;
import co.com.pattern.proxy.AccountProxy;
import co.com.pattern.service.IAccount;
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
		Mono<Account> accountMono = Mono.just(
				Account.builder().id(1).client("Sergio Stives Barrios Buitrago").money(100.000D).build()
		);

		IAccount account = new AccountProxy();

		accountMono.doOnNext(accountNew -> account.showBalance(Mono.just(accountNew)))
						.subscribe();

		accountMono
				.doOnNext(accountNew -> System.out.println("Deposit: 200.000"))
				.flatMap(accountNew -> account.depositMoney(Mono.just(accountNew), 200.000D))
				.doOnNext(accountNew -> account.showBalance(Mono.just(accountNew)))
				.subscribe();

		accountMono
				.doOnNext(accountNew -> System.out.println("Withdrawals: 100.000"))
				.flatMap(accountNew -> account.withdrawals(Mono.just(accountNew), 100.000D))
				.doOnNext(accountNew -> account.showBalance(Mono.just(accountNew)))
				.subscribe();
	}
}
