package optional;

import java.util.Optional;

class Delivery {
    private String partner;

    public Delivery(String partner) {
        this.partner = partner;
    }

    public Optional<String> getPartner() {
        return Optional.ofNullable(partner);
    }
}

public class DeleveryPartner {
    public static void main(String[] args) {

        Delivery d1 = new Delivery("Swiggy Express");
        Delivery d2 = new Delivery(null);

        String partner1 = d1.getPartner().orElse("Not Assigned");
        String partner2 = d2.getPartner().orElse("Not Assigned");

        System.out.println(partner1);
        System.out.println(partner2);
    }
}

