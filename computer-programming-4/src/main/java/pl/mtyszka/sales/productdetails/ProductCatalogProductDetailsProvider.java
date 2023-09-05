package pl.mtyszka.sales.productdetails;

import pl.mtyszka.productcatalog.Product;
import pl.mtyszka.productcatalog.ProductCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductCatalogProductDetailsProvider implements ProductDetailsProvider {

    ProductCatalog productCatalog;

    public ProductCatalogProductDetailsProvider(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Optional<ProductDetails> load(String productId) {

        Product product = productCatalog.loadById(productId);

        if (product == null) {
            return Optional.empty();
        }

        ProductDetails productDetails = new ProductDetails(product.getId(), product.getName(), product.getPrice());
        return Optional.of(productDetails);
    }
}
