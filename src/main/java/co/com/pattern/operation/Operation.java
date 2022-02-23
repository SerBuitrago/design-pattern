package co.com.pattern.operation;

import co.com.pattern.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Operation {
    protected Account account;
    protected double amount;
}
