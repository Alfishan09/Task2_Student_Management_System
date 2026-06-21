package SourceCode;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ids = new int[100];
        String[] names = new String[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    ids[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    names[count] = sc.nextLine();

                    count++;
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Students Available.");
                    } else {
                        System.out.println("\nStudent List:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + ids[i]
                                    + " Name: " + names[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (ids[i] == searchId) {
                            System.out.println("Student Found: "
                                    + names[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}