package co.com.pattern.decorator;

import co.com.pattern.model.Account;
import co.com.pattern.service.IAccount;

public class ArmorDecorator extends AccountDecorator{

    public ArmorDecorator(IAccount accountDecorator) {
        super(accountDecorator);
    }

    @Override
    public void open(Account account){
        this.accountDecorator.open(account);
        addArmor(account);
    }

    public void addArmor(Account account){
        System.out.println("\nShielding has been added to the customer account ".concat(account.getClient()).concat("."));
    }
}
