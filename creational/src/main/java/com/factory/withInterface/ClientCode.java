package com.factory.withInterface;

public class ClientCode {
    private final PaymentService service;

    ClientCode(PaymentServiceFactory factory) {
        this.service = factory.createService();
    }

    public void processPayment(double amount) {
        service.processPayment(amount);
    }
}
