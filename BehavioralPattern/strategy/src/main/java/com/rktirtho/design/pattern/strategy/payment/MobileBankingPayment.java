package com.rktirtho.design.pattern.strategy.payment;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class MobileBankingPayment implements Payment{

    private final HttpServletRequest request;

    @Override
    public String pay(int amount) {

        String phoneNumber = request.getHeader("phoneNumber");
        String password = request.getHeader("password");
        log.info("requested user phone number is {} and password is {}", phoneNumber, password);
        return "Payment From Mobile banking system";
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.MOBILE;
    }
}
