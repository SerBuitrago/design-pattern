package co.com.pattern.decorator;

import co.com.pattern.model.Account;
import co.com.pattern.service.IAccount;

public abstract class AccountDecorator implements IAccount {

    protected  IAccount accountDecorator;

    public AccountDecorator(IAccount accountDecorator){
        this.accountDecorator = accountDecorator;
    }

    @Override
    public void open(Account account){
        this.accountDecorator.open(account);
    }
}
