package com.factory.withInterface;

public class PayPalPaymentServiceFactory implements PaymentServiceFactory {
    @Override
    public PaymentService createService() {
        return new PayPalPaymentService();
    }
}
