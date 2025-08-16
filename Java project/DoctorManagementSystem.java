import java.util.ArrayList;
import java.util.Scanner;

class Doctor {
    private int id;
    private String name;
    private String specialization;
    private String phoneNumber;

    public Doctor(int id, String name, String specialization, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("------------------------");
    }
}

public class DoctorManagementSystem {
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Doctor Management System ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. View All Doctors");
            System.out.println("3. Search Doctor by ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    viewDoctors();
                    break;
                case 3:
                    searchDoctorById();
                    break;
                case 0:
                    System.out.println("Exiting System.");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 0);
    }

    private static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Specialization: ");
        String specialization = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        Doctor doctor = new Doctor(id, name, specialization, phone);
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    private static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }

        System.out.println("\n--- List of Doctors ---");
        for (Doctor doc : doctors) {
            doc.displayInfo();
        }
    }

    private static void searchDoctorById() {
        System.out.print("Enter Doctor ID to search: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (Doctor doc : doctors) {
            if (doc.getId() == id) {
                doc.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Doctor not found.");
        }
    }
}
