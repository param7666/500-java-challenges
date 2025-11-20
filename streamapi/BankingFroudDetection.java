package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/*
A list of transactions has amount, type, and location.
Find all transactions that are above ₹50,000, of type “CREDIT”, and done outside India.
Finally, collect them into a list of transaction IDs.
 */


public class BankingFroudDetection {
public static void main(String[] args) {
	
	Transcation t1  = new Transcation(1L, 75000.0, "CREDIT", "USA");
	Transcation t2  = new Transcation(2L, 45000.0, "DEBIT", "India");
	Transcation t3  = new Transcation(3L, 90000.0, "CREDIT", "UK");
	Transcation t4  = new Transcation(4L, 150000.0, "CREDIT", "Australia");
	Transcation t5  = new Transcation(5L, 55000.0, "CREDIT", "India");
	Transcation t6  = new Transcation(6L, 62000.0, "DEBIT", "Canada");
	Transcation t7  = new Transcation(7L, 51000.0, "CREDIT", "Germany");
	Transcation t8  = new Transcation(8L, 80000.0, "DEBIT", "India");
	Transcation t9  = new Transcation(9L, 120000.0, "CREDIT", "France");
	Transcation t10 = new Transcation(10L, 20000.0, "CREDIT", "India");
	Transcation t11 = new Transcation(11L, 54000.0, "DEBIT", "Italy");
	Transcation t12 = new Transcation(12L, 65000.0, "CREDIT", "Japan");
	Transcation t13 = new Transcation(13L, 47000.0, "DEBIT", "India");
	Transcation t14 = new Transcation(14L, 85000.0, "CREDIT", "Singapore");
	Transcation t15 = new Transcation(15L, 5000.0,  "CREDIT", "India");

	List<Transcation> transactions = Arrays.asList(t1, t2, t3, t4, t5,t6, t7, t8, t9, t10,t11, t12, t13, t14, t15);
	List<Long> ids=transactions.stream().filter(t->t.getAmount()>50000 && t.getType().equals("CREDIT") && !t.getLocation().equals("India"))
			.map(t->t.getId()).collect(Collectors.toList());
	
	System.out.println(ids);
	
}
}

class Transcation {
	private Long id;
	private Double amount;
	private String type;
	private String location;
	
	
	public Transcation(Long id, Double amount, String type, String location) {
		this.id = id;
		this.amount = amount;
		this.type = type;
		this.location = location;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Transcation [id=" + id + ", amount=" + amount + ", type=" + type + ", location=" + location + "]";
	}
	
	
}