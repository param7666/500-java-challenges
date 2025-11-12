package functional;

import java.time.LocalDate;
import java.util.function.Predicate;


public class ChechValidDateTest {
public static void main(String[] args) {
	Predicate<LocalDate> pr=(d)->d.isAfter(LocalDate.now());
	System.out.println(pr.test(LocalDate.of(2023, 9, 21)));
}
}
