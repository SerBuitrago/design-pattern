package co.com.pattern.service;

import co.com.pattern.model.Account;
import reactor.core.publisher.Mono;

public interface IAccount {

    Mono<Account> withdrawals(Mono<Account> account, Double amount);

    Mono<Account> depositMoney(Mono<Account> account, Double amount);

    void showBalance(Mono<Account> account);
}
