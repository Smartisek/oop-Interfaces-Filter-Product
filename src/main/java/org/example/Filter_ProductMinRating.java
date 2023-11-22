package org.example;

public class Filter_ProductMinRating implements IFilter_Product{
    private final int starRating;
    public Filter_ProductMinRating(int starRating){
        this.starRating = starRating;
    }

    public boolean matches(Product product){

        return product.getStarRating() > starRating;
    }
}
