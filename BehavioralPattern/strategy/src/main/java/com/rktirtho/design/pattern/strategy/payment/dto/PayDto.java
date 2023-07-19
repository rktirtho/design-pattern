package com.rktirtho.design.pattern.strategy.payment.dto;

import com.rktirtho.design.pattern.strategy.payment.PaymentType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayDto {
    private PaymentType type;
    private int amount;
}
