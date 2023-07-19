package com.rktirtho.design.pattern.strategy.payment;

import com.rktirtho.design.pattern.strategy.payment.dto.CreditCard;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreditCardPayment implements Payment{

    private final HttpServletRequest request;
    @Override
    public String pay(int amount) {
        CreditCard creditCard = getCreditCardInformation();
        log.info(creditCard.toString());

        return "Paid from Credit card";
    }

    private CreditCard getCreditCardInformation() {
        return CreditCard
                .builder()
                .cardNumber(request.getHeader("cardNumber"))
                .cvv(Integer.parseInt(request.getHeader("cvv")))
                .expiredDate(request.getHeader("expireDate"))
                .build();
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.CREDIT;
    }
}
