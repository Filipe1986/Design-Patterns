package com.factory.PaymentPortAndAdapter;

public class PayPalPaymentServiceAdapter implements PaymentServicePort {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal");
    }
}
