package optional;

import java.util.Optional;

class Policy {
    private String nominee;

    public Policy(String nominee) {
        this.nominee = nominee;
    }

    public Optional<String> getNominee() {
        return Optional.ofNullable(nominee);
    }
}

public class Nomine {
    public static void main(String[] args) {

        Policy p1 = new Policy("Ramesh");
        Policy p2 = new Policy(null);

        p1.getNominee().ifPresent(n -> System.out.println("Nominee: " + n));
        p2.getNominee().ifPresent(n -> System.out.println("Nominee: " + n)); // skipped
    }
}
