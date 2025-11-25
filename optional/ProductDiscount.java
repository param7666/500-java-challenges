package optional;

import java.util.Optional;

class Product {
    private Double price;
    private Double discount;  // may be null

    public Product(double price, Double discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public Optional<Double> getDiscount() {
        return Optional.ofNullable(discount);
    }
}



public class ProductDiscount {
public static void main(String[] args) {
	Product p1=new Product(1000.0, 100.0);
	Product p2=new Product(1000.0, null);
	
	double finalPrice=p1.getDiscount().map(d->p1.getPrice()-d).orElse(p1.getPrice());
	
	double finalPrice2=p2.getDiscount().map(d->p2.getPrice()-d).orElse(p2.getPrice());
	
	
	System.out.println(finalPrice);
	System.out.println(finalPrice2);
}
}
