package co.com.pattern.service.impl;

import co.com.pattern.model.Account;
import co.com.pattern.service.IAccount;

public class AccountSaving implements IAccount {
    @Override
    public void open(Account account) {
        System.out.println("\n================================================");
        System.out.println("Savings account opened.");
        System.out.println("Client: "+account.getClient());
        System.out.println("================================================");
    }
}
