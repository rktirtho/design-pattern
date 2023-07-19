package com.rktirtho.design.pattern.strategy.controller;

import com.rktirtho.design.pattern.strategy.payment.PaymentFactory;
import com.rktirtho.design.pattern.strategy.payment.dto.PayDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentFactory paymentFactory;


    @PostMapping("pay")
    public String pay(@RequestBody PayDto payDto) {
        return paymentFactory.getPaymentMethod(payDto.getType()).pay(payDto.getAmount());
    }
}
