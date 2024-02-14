package rvt.exercises;
import java.util.ArrayList;

public class Main {
    // public static void main(String[] args) throws Exception {
    public static void printPersons(ArrayList<Person> persons) {
        // Part 1
        System.out.println("----------PART 1----------");

        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        // Part 2
        System.out.println();
        System.out.println("----------PART 2----------");

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        // System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());

        // Part 3
        System.out.println();
        System.out.println("----------PART 3----------");

        // Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);

        // Part 4
        System.out.println();
        System.out.println("----------PART 4----------");

        Teacher Ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher Esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(Ada);
        System.out.println(Esko);

        // Student Ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);

    }

    public static void main(String[] args) throws Exception {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

        // --------------------
        // Interfaces
        System.out.println();
        System.out.println("----------INTERFACES----------");
        System.out.println();

        TextMessage message = new TextMessage("ope", "It's going great!");
        System.out.println(message.read());

        ArrayList<TextMessage> textMessage = new ArrayList<>();
        textMessage.add(new TextMessage("private number", "I hid the body."));
        
        ArrayList<String> pages = new ArrayList<>();
        pages.add("Split your method into short, readable entities.");
        pages.add("Separate the user-interface logic from the application logic.");
        pages.add("Always program a small part initially that solves a part of the problem.");
        pages.add("Practice makes the master. Try different out things for yourself and work on your own projects.");

        Ebook book = new Ebook("Tips for programming.", pages);

        int page = 0;
        while (page < book.pages()) {
            System.out.println(book.read());
            page = page + 1;
        }
    }
}