package Collections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class Operation {
    private final String accNo;
    private final BigDecimal amount;


    public Operation(String accNo, BigDecimal amount) {
        this.accNo = accNo;
        this.amount = amount;
    }

    public String getAccNo() {
        return accNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public static void main(String[] args) {
        var operations = List.of(
                new Operation("123", new BigDecimal("10")),
                new Operation("456", new BigDecimal("1200")),
                new Operation("123", new BigDecimal("-4")),
                new Operation("123", new BigDecimal("8")),
                new Operation("456", new BigDecimal("800")),
                new Operation("456", new BigDecimal("-1500")),
                new Operation("123", new BigDecimal("2")),
                new Operation("123", new BigDecimal("-6.5")),
                new Operation("456", new BigDecimal("-600"))
        );
        var balances = new HashMap<String, BigDecimal>();
/*
        operations.forEach(op -> {
            var key = op.getAccNo();
            balances.putIfAbsent(key, BigDecimal.ZERO);
            balances.computeIfPresent(key, (accNo, prev) -> prev.add(op.getAmount()));
        });
*/
        operations.forEach(op ->
                balances.merge(op.getAccNo(), op.getAmount(),
                        BigDecimal::add)
        );

        balances.forEach((k, v) -> System.out.println(k + " " + v));



    }

}
