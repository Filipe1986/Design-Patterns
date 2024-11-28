package com.factory.withInterface;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe payment processed for amount: " + amount);
    }
}
