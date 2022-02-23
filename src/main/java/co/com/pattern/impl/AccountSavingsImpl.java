package co.com.pattern.impl;

import co.com.pattern.Account;
import co.com.pattern.IAccount;

public class AccountSavingsImpl extends Account implements IAccount {

    public AccountSavingsImpl(){
        super("Savings", 0D);
    }

    @Override
    public IAccount cloneAccount() {
        AccountSavingsImpl accountSavings = null;
        try {
            accountSavings = (AccountSavingsImpl) clone();
        }catch (CloneNotSupportedException error){
            error.printStackTrace();
        }
        return accountSavings;
    }
}
