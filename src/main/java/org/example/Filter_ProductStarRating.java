package org.example;

public class Filter_ProductStarRating implements IFilter_Product{
    private final int starRating;
        public Filter_ProductStarRating(int starRating){
            this.starRating = starRating;
        }

        public boolean matches(Product product){
            return product.getStarRating() == starRating;
        }
}
