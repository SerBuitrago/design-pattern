package co.com.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    private Integer id;
    private Double money;

    public void withdrawals(double amount){
        this.money = this.money - amount;
        System.out.println("Withdrawals: $".concat(String.valueOf(money)));
    }

    public void deposit(double amount){
        this.money = this.money + amount;
        System.out.println("Deposit: $".concat(String.valueOf(money)));
    }
}
