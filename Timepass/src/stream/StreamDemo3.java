package stream;

import java.util.stream.Stream;

class User {

	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}


public class StreamDemo3 {
public static void main(String[] args) {
	User u1 = new User("Anushka", 25);
	User u2 = new User("Smith", 30);
	User u3 = new User("Raju", 15);
	User u4 = new User("Rani", 10);
	User u5 = new User("Charles", 35);
	User u6 = new User("Ashok", 30);

	Stream<User> st=Stream.of(u1,u2,u3,u4,u5,u6);
	st.filter(user->user.age>18).forEach(user->System.out.println(user.name));
}
}
