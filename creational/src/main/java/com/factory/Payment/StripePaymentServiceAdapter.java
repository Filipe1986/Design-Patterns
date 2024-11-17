package com.factory.Payment;

public class StripePaymentServiceAdapter implements PaymentServicePort {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe");
    }
}
