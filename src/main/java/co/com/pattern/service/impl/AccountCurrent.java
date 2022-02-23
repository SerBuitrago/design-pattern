package co.com.pattern.service.impl;

import co.com.pattern.model.Account;
import co.com.pattern.service.IAccount;

public class AccountCurrent implements IAccount {

    @Override
    public void open(Account account) {
        System.out.println("\n================================================");
        System.out.println("Current account opened.");
        System.out.println("Client: "+account.getClient());
        System.out.println("================================================");
    }
}
