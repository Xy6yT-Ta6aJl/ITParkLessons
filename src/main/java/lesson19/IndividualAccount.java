package lesson19;

import java.math.BigDecimal;

public class IndividualAccount extends DepositAndWithdraw{

    private BigDecimal balance;

    public IndividualAccount(BigDecimal balance){
        this.balance = balance;
    }
}
