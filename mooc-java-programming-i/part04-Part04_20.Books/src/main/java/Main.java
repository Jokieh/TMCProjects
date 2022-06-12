import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();

            if (title.isEmpty()) break;

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title,pages,publicationYear));
        }

        System.out.println("What information will be printed?");
        String whatToPrint = scanner.nextLine();

        if (whatToPrint.equals("everything")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            }
        } else if (whatToPrint.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }
        }

    }
}
