package com.rktirtho.design.pattern.strategy.payment;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OnlinePayment implements Payment{

    private final HttpServletRequest request;
    @Override
    public String pay(int amount) {
        String userName = request.getHeader("userName");
        String password = request.getHeader("password");
        log.info("requested user userName is {} and password is {}", userName, password);
        return "Paid from online payment Method";
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.ONLINE;
    }
}
