package com.rktirtho.design.pattern.strategy.payment;


import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@Component
public class PaymentFactory {
    private Map<PaymentType, Payment> map;

    public PaymentFactory(Set<Payment> payments) {
        map = new EnumMap<>(PaymentType.class);
        payments.forEach(payment -> map.put(payment.getPaymentType(), payment));
    }

    public Payment getPaymentMethod(PaymentType paymentType){
        return map.get(paymentType);
    }
}
