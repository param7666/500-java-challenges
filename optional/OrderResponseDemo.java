package optional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

class OrderResponse {
    private LocalDate deliveryDate;

    public OrderResponse(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return Optional.ofNullable(deliveryDate);
    }
}

public class OrderResponseDemo {
	
	public static String getFormatedDate(OrderResponse r)  {
		return r.getDeliveryDate().map(d->d.format(DateTimeFormatter.ofPattern("yyyy-mm-dd"))).orElse("Date Not Available");
	}
	
	
public static void main(String[] args) {
	 OrderResponse r1 = new OrderResponse(LocalDate.of(2025, 12, 25));
     OrderResponse r2 = new OrderResponse(null);
     
     System.out.println("Response1:: "+getFormatedDate(r1));
     System.out.println("Response1:: "+getFormatedDate(r2));

     
     
}
}
