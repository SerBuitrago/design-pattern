package co.com.pattern.service.impl;

import co.com.pattern.model.Account;
import co.com.pattern.service.IAccount;
import reactor.core.publisher.Mono;

public class AccountBank implements IAccount {

    @Override
    public Mono<Account> withdrawals(Mono<Account> account, Double amount) {
        return Mono.just(account.block().getMoney() - amount)
                .flatMap(money ->
                        account.flatMap(accountDiscount-> {
                            accountDiscount.setMoney(money);
                            return Mono.just(accountDiscount);
                        })
                ).doOnNext(System.out::println);
    }

    @Override
    public Mono<Account> depositMoney(Mono<Account> account, Double amount) {
        return Mono.just(account.block().getMoney() + amount)
                .flatMap(money ->
                        account.flatMap(accountDiscount-> {
                            accountDiscount.setMoney(money);
                            return Mono.just(accountDiscount);
                        })
                ).doOnNext(System.out::println);
    }

    @Override
    public void showBalance(Mono<Account> account) {
        account.doOnNext(accountPrintln -> System.out.println("\nThe current balance is: $".concat(String.valueOf(accountPrintln.getMoney())))).subscribe();
    }
}
