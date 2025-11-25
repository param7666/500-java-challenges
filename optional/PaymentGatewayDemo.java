package optional;

import java.util.Optional;

class Payment {
    private String upiId; // may be null

    public Payment(String upiId) {
        this.upiId = upiId;
    }

    public Optional<String> getUpiId() {
        return Optional.ofNullable(upiId);
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {

        Payment p1 = new Payment("sundar@upi");
        Payment p2 = new Payment(null);

        p1.getUpiId().ifPresent(id -> {
            System.out.println("Validating UPI ID: " + id);
        });

        p2.getUpiId().ifPresent(id -> {
            System.out.println("This will not print.");
        });

        String msg = p2.getUpiId()
                       .map(id -> "UPI ID exists: " + id)
                       .orElse("UPI not provided, using card payment");

        System.out.println(msg);
    }
}
