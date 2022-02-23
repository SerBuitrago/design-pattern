package co.com.pattern.proxy;

import co.com.pattern.model.Account;
import co.com.pattern.service.IAccount;
import co.com.pattern.service.impl.AccountBank;
import reactor.core.publisher.Mono;

public class AccountProxy implements IAccount {

    private AccountBank accountBank;

    @Override
    public Mono<Account> withdrawals(Mono<Account> account, Double amount) {
        if(accountBank != null)
            return accountBank.withdrawals(account, amount);
        accountBank = new AccountBank();
        return accountBank.withdrawals(account, amount);
    }

    @Override
    public Mono<Account> depositMoney(Mono<Account> account, Double amount) {
        if(accountBank != null)
            return accountBank.depositMoney(account, amount);
        accountBank = new AccountBank();
        return accountBank.depositMoney(account, amount);
    }

    @Override
    public void showBalance(Mono<Account> account) {
        if(accountBank != null)
            accountBank.showBalance(account);
        else {
            accountBank = new AccountBank();
            accountBank.showBalance(account);
        }
    }
}
