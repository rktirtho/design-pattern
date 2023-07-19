package com.rktirtho.design.pattern.strategy.payment;

public interface Payment {
    String pay(int amount);

    PaymentType getPaymentType();
}
