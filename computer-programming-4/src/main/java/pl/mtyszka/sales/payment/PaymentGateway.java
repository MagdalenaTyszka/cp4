package pl.mtyszka.sales.payment;

public interface PaymentGateway {
    PaymentData register(RegisterPaymentRequest request);
}
