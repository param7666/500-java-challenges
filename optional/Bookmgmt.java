package optional;

import java.util.Optional;

class Book {
    private Integer edition;

    public Book(Integer edition) {
        this.edition = edition;
    }

    public Optional<Integer> getEdition() {
        return Optional.ofNullable(edition);
    }
}

public class Bookmgmt {
    public static void main(String[] args) {

        Book b1 = new Book(3);
        Book b2 = new Book(null);

        String result1 = b1.getEdition()
                .map(e -> "Edition: " + e)
                .orElse("Edition not available");

        String result2 = b2.getEdition()
                .map(e -> "Edition: " + e)
                .orElse("Edition not available");

        System.out.println(result1);
        System.out.println(result2);
    }
}

