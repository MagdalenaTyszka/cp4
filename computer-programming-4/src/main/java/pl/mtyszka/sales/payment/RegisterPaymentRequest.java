package pl.mtyszka.sales.payment;

import pl.mtyszka.sales.offering.Offer;
import pl.mtyszka.sales.reservation.OfferAcceptanceRequest;

public class RegisterPaymentRequest {
    private OfferAcceptanceRequest request;
    private Offer offer;

    public RegisterPaymentRequest(OfferAcceptanceRequest request, Offer offer) {

        this.request = request;
        this.offer = offer;
    }

    public static RegisterPaymentRequest of(OfferAcceptanceRequest request, Offer offer) {
        return new RegisterPaymentRequest(request, offer);
    }

    public OfferAcceptanceRequest getClientData() {
        return request;
    }

    public Offer getOffer() {
        return offer;
    }
}
