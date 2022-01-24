package lesson19;

import java.math.BigDecimal;

public class EntityAccount extends DepositAndWithdraw{

    private BigDecimal balance;

    public EntityAccount(BigDecimal balance) {
        this.balance = balance;
    }
}
