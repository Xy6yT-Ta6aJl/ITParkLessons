package lesson19;

import java.math.BigDecimal;

public class DepositAndWithdraw {

    public static BigDecimal deposit(BigDecimal balance, BigDecimal depositMoney){
        return balance.add(depositMoney);
    }

    public static BigDecimal withdraw(BigDecimal balance, BigDecimal depositMoney){
        return balance.subtract(depositMoney);
    }
}
