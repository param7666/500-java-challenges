package streamapi;

/*
Hospital Patients – Critical Case Report

A list of patients has name, age, condition, and severity.
Filter patients whose condition == "Heart" and severity > 7, sort by severity, limit to 5, and return names.
 */

import java.util.*;
public class CriticalCaseReport {
public static void main(String[] args) {
	List<Patient> patients = Arrays.asList(
            new Patient("Amit", 45, "Heart", 9),
            new Patient("Sneha", 50, "Heart", 8),
            new Patient("Rahul", 39, "Heart", 6),
            new Patient("Karan", 60, "Heart", 10),
            new Patient("Priya", 55, "Heart", 7),

            new Patient("Meena", 70, "Heart", 9),
            new Patient("Vikram", 42, "Heart", 5),
            new Patient("Rohit", 48, "Heart", 8),
            new Patient("Tina", 63, "Heart", 9),
            new Patient("Sanjay", 52, "Heart", 4),

            new Patient("Pooja", 44, "Lungs", 8),
            new Patient("Deepak", 28, "Brain", 9),
            new Patient("Neha", 36, "Lungs", 7),
            new Patient("Arjun", 33, "Kidney", 8),
            new Patient("Lakshmi", 57, "Brain", 6)
    );
	patients.stream().filter(p->p.getCondition().equals("Heart"))
	.filter(p->p.getSeverity()>7)
	.sorted(Comparator.comparingInt(Patient::getSeverity))
	.map(p->p.getName()).forEach(System.out::println);
}
}


class Patient {
    private String name;
    private int age;
    private String condition;
    private int severity;

    public Patient(String name, int age, String condition, int severity) {
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + condition + " | Severity: " + severity;
    }
}
