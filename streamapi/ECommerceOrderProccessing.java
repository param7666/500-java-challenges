package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
E-Commerce Order Processing

A list of orders contains orderId, amount, status, and paymentType.
Find all orders with status “DELIVERED”, group them by paymentType, and then count how many orders are done through UPI.

 */


public class ECommerceOrderProccessing {

	public static void main(String[] args) {
		Order o1  = new Order(101, 1200, "DELIVERED", "UPI");
		Order o2  = new Order(102, 850,  "PENDING",   "CARD");
		Order o3  = new Order(103, 450,  "DELIVERED", "COD");
		Order o4  = new Order(104, 2200, "DELIVERED", "UPI");
		Order o5  = new Order(105, 999,  "CANCELLED", "NETBANKING");
		Order o6  = new Order(106, 1500, "DELIVERED", "CARD");
		Order o7  = new Order(107, 700,  "DELIVERED", "UPI");
		Order o8  = new Order(108, 300,  "PENDING",   "COD");
		Order o9  = new Order(109, 1800, "DELIVERED", "NETBANKING");
		Order o10 = new Order(110, 650,  "DELIVERED", "UPI");

		List<Order> orders = Arrays.asList(
			    o1, o2, o3, o4, o5, o6, o7, o8, o9, o10
			);

		List<Order> delevaryOrders=orders.stream().filter(o->o.getStatus().equals("DELIVERED")).collect(Collectors.toList());
		Map<String, Long> groupByPaymentType=delevaryOrders.stream().collect(Collectors.groupingBy(Order::getPaymentType,Collectors.counting()));
		long upiCount=groupByPaymentType.getOrDefault("UPI", 0L);
		System.out.println("Delevered Orders:: ");
		delevaryOrders.forEach(System.out::println);
		System.out.println("Group BY Payment Type");
		System.out.println(groupByPaymentType);
		System.out.println("UPI Payment COunt:: "+upiCount);
		
	}
}


class Order{
	private int orderId;
	private double amount;
	private String status;
	private String paymentType;
	
	
	public Order(int orderId, double amount, String status, String paymentType) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.status = status;
		this.paymentType = paymentType;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", amount=" + amount + ", status=" + status + ", paymentType="
				+ paymentType + "]";
	}
	
	
	
	
}