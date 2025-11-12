package metrefrence;

import java.util.function.Supplier;

@FunctionalInterface
interface Notifier{
	void send(String msg);
}

public class NotificationService {

	public void sendMessage(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Supplier<NotificationService> sp=NotificationService::new;
		NotificationService ns=sp.get();
		Notifier notifier=ns::sendMessage;
		notifier.send("Hey.......");
	}
}
