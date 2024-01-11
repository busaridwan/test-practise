package com.busaridwan.testpractice.solid.singleresponsibility;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Account {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private BigDecimal balance;
    private boolean isChecked;
}
