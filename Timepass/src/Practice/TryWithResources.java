package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {
public static void main(String[] args) {
	try(BufferedReader bf=new BufferedReader(new FileReader("abc.text"))) {
		System.out.println(bf.readLine());
	} catch(Exception e) {
		System.out.println("File not found");
	}
}
}
