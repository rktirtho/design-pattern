package com.rktirtho.design.pattern.strategy.payment.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@ToString
public class CreditCard {
    private String cardNumber;
    private int cvv;
    private String expiredDate;
}
