
/*
16.13 (Duplicate Elimination) Write a program that reads
in a series of first names and eliminates duplicates by
storing them in a Set. Allow the user to search for a first name.
*/


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstNameProgram {


    public static void main(String[] args) {


        Set<String> firstNamesSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a first name (press Enter to finish): ");
            String firstName = scanner.nextLine().trim();


            if (firstName.isEmpty()) {
                break;
            }


            firstNamesSet.add(firstName);
        }


        System.out.println("\nUnique first names:");
        for (String name : firstNamesSet) {
            System.out.println(name);
        }


        System.out.print("\nEnter a first name to search: ");
        String searchName = scanner.nextLine().trim();


        if (firstNamesSet.contains(searchName)) {
            System.out.println(searchName + " is in the set.");
        } else {
            System.out.println(searchName + " is not in the set.");
        }

        scanner.close();
    }

}
