package second_week.practiceLesson1;

import java.util.Scanner;

/**
 * Created by George on 24.05.2017.
 */
public class AboutPerson {
    public static void main(String[] args) {




        Person[] person = new Person[3];
        for (int i = 0; i < person.length; i++) {
            person[i] = getPerson();

        }
        Person[] person1 = new Person[3];
        for (int i = 0; i < person1.length; i++) {
            person[i].aboutPerson();
            System.out.println();
        }
    }

    private static Person getPerson() {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.println("Enter your age:");
        person.age = scanner.nextInt();

        System.out.println("Enter your Name:");
        person.name = scanner.next();

        System.out.println("Enter your Surname:");
        person.surname = scanner.next();

        return person;
    }
}

