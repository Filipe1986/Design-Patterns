package com.factory.withInterface;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal payment processed for amount: " + amount);
    }
}
