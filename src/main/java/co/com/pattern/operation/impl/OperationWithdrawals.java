package co.com.pattern.operation.impl;

import co.com.pattern.model.Account;
import co.com.pattern.operation.IOperation;
import co.com.pattern.operation.Operation;

public class OperationWithdrawals extends Operation implements IOperation {

    public OperationWithdrawals(Account account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        this.account.withdrawals(this.amount);
    }
}
