package pl.mtyszka.sales.productdetails;

import pl.mtyszka.sales.productdetails.ProductDetails;

import java.util.Optional;

public interface ProductDetailsProvider {
    public Optional<ProductDetails> load(String productId);
}
