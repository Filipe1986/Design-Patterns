package com.factory.withInterface;

public class StripePaymentServiceFactory implements PaymentServiceFactory {
    @Override
    public PaymentService createService() {
        return new StripePaymentService();
    }
}
