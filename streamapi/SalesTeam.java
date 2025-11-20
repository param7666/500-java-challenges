package streamapi;

/*
Sales Team – Monthly Targets

A list contains employeeName, month, achieved, and target.
Find employees who achieved more than target, group by month, and calculate total achievers per month.
 */

import java.util.*;
import java.util.stream.Collectors;
public class SalesTeam {

	public static void main(String[] args) {
        List<SalesRecord> records = Arrays.asList(
                new SalesRecord("Amit", "January", 120000, 100000),
                new SalesRecord("Sneha", "January", 95000, 100000),
                new SalesRecord("Rohit", "January", 130000, 110000),
                new SalesRecord("Karan", "February", 80000, 75000),
                new SalesRecord("Pooja", "February", 70000, 90000),

                new SalesRecord("Neha", "February", 90000, 85000),
                new SalesRecord("Rahul", "March", 150000, 140000),
                new SalesRecord("Tina", "March", 100000, 105000),
                new SalesRecord("Vikram", "March", 170000, 160000),
                new SalesRecord("Sanjay", "April", 85000, 90000),

                new SalesRecord("Meena", "April", 110000, 100000),
                new SalesRecord("Priya", "April", 95000, 95000),
                new SalesRecord("Deepak", "May", 140000, 130000),
                new SalesRecord("Kiran", "May", 120000, 115000),
                new SalesRecord("Arjun", "May", 90000, 95000)
        );
        
        
       Map<String, Long> result= records.stream().filter(s->s.getAchieved()>s.getTarget()).collect(Collectors.groupingBy(SalesRecord::getMonth,Collectors.counting()));
       System.out.println(result);
	}
}


class SalesRecord {
    private String employeeName;
    private String month;
    private double achieved;
    private double target;

    public SalesRecord(String employeeName, String month, double achieved, double target) {
        this.employeeName = employeeName;
        this.month = month;
        this.achieved = achieved;
        this.target = target;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getMonth() {
        return month;
    }

    public double getAchieved() {
        return achieved;
    }

    public double getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return employeeName + " | " + month + " | " + achieved + "/" + target;
    }
}

