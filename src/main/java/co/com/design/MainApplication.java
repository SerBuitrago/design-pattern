package co.com.design;

import co.com.pattern.Invoker;
import co.com.pattern.model.Account;
import co.com.pattern.operation.impl.OperationDeposit;
import co.com.pattern.operation.impl.OperationWithdrawals;
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
		Account account = Account.builder().id(1).money(100.000D).build();

		OperationDeposit operationDeposit = new OperationDeposit(account, 200.000D);
		OperationWithdrawals operationWithdrawals = new OperationWithdrawals(account, 100.000D);

		Invoker invoker = new Invoker();

		invoker.add(operationDeposit);
		invoker.add(operationWithdrawals);

		invoker.perform();
	}
}
