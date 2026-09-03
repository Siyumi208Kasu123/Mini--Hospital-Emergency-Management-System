package hospital;

import java.util.Scanner;

public class HospitalManagementSystem {

    static Scanner scanner = new Scanner(System.in);

    static PatientBST patientTree = new PatientBST();

    static EmergencyQueue emergencyQueue =
            new EmergencyQueue();

    static TreatmentStack treatmentStack =
            new TreatmentStack();

    static VisitLinkedList visitHistory =
            new VisitLinkedList();

    public static void main(String[] args) {

        int choice;

        do {

            displayMainMenu();

            choice = getInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addPatient();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    displayPatients();
                    break;

                case 5:
                    addEmergencyPatient();
                    break;

                case 6:
                    treatNextPatient();
                    break;

                case 7:
                    displayEmergencyQueue();
                    break;

                case 8:
                    addTreatmentRecord();
                    break;

                case 9:
                    removeLatestTreatment();
                    break;

                case 10:
                    displayTreatmentHistory();
                    break;

                case 11:
                    addVisit();
                    break;

                case 12:
                    searchVisit();
                    break;

                case 13:
                    removeVisit();
                    break;

                case 14:
                    displayVisitHistory();
                    break;

                case 0:
                    System.out.println(
                            "\nThank you for using the "
                            + "Hospital Management System."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }

        } while (choice != 0);

        scanner.close();
    }

    // =========================================
    // MAIN MENU
    // =========================================

    static void displayMainMenu() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("     MINI HOSPITAL EMERGENCY SYSTEM");
        System.out.println("========================================");

        System.out.println("1.  Add Patient");
        System.out.println("2.  Search Patient");
        System.out.println("3.  Delete Patient");
        System.out.println("4.  Display All Patients");

        System.out.println("5.  Add Patient to Emergency Queue");
        System.out.println("6.  Treat Next Patient");
        System.out.println("7.  Display Emergency Queue");

        System.out.println("8.  Add Treatment Record");
        System.out.println("9.  Remove Latest Treatment");
        System.out.println("10. Display Treatment History");

        System.out.println("11. Add Patient Visit");
        System.out.println("12. Search Visit");
        System.out.println("13. Remove Visit");
        System.out.println("14. Display Visit History");

        System.out.println("0.  Exit");

        System.out.println("========================================");
    }

    // =========================================
    // ADD PATIENT
    // =========================================

    static void addPatient() {

        System.out.println("\n===== ADD PATIENT =====");

        int id = getInt("Enter Patient ID: ");

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        int age = getInt("Enter Age: ");

        System.out.print("Enter Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Medical Condition: ");
        String condition = scanner.nextLine();

        Patient patient = new Patient(
                id,
                name,
                age,
                contact,
                condition
        );

        patientTree.insert(patient);

        System.out.println(
                "Patient added successfully."
        );
    }

    // =========================================
    // SEARCH PATIENT
    // =========================================

    static void searchPatient() {

        System.out.println("\n===== SEARCH PATIENT =====");

        int id = getInt("Enter Patient ID: ");

        Patient patient =
                patientTree.search(id);

        if (patient != null) {

            System.out.println("Patient found:");
            patient.displayPatient();

        } else {

            System.out.println(
                    "Patient ID " + id + " not found."
            );
        }
    }

    // =========================================
    // DELETE PATIENT
    // =========================================

    static void deletePatient() {

        System.out.println("\n===== DELETE PATIENT =====");

        int id = getInt("Enter Patient ID: ");

        patientTree.delete(id);
    }

    // =========================================
    // DISPLAY PATIENTS
    // =========================================

    static void displayPatients() {

        patientTree.displayInOrder();
    }

    // =========================================
    // ADD EMERGENCY PATIENT
    // =========================================

    static void addEmergencyPatient() {

        System.out.println(
                "\n===== ADD EMERGENCY PATIENT ====="
        );

        int id = getInt("Enter Patient ID: ");

        Patient patient =
                patientTree.search(id);

        if (patient != null) {

            emergencyQueue.enqueue(patient);

        } else {

            System.out.println(
                    "Patient not found in patient records."
            );
        }
    }

    // =========================================
    // TREAT NEXT PATIENT
    // =========================================

    static void treatNextPatient() {

        System.out.println(
                "\n===== TREAT NEXT PATIENT ====="
        );

        Patient patient =
                emergencyQueue.dequeue();

        if (patient != null) {

            System.out.println(
                    "Patient selected for treatment:"
            );

            patient.displayPatient();

            System.out.println(
                    "Complete the treatment and "
                    + "add the record using option 8."
            );
        }
    }

    // =========================================
    // DISPLAY EMERGENCY QUEUE
    // =========================================

    static void displayEmergencyQueue() {

        emergencyQueue.displayQueue();
    }

    // =========================================
    // ADD TREATMENT RECORD
    // =========================================

    static void addTreatmentRecord() {

        System.out.println(
                "\n===== ADD TREATMENT RECORD ====="
        );

        int treatmentId =
                getInt("Enter Treatment ID: ");

        int patientId =
                getInt("Enter Patient ID: ");

        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctorName = scanner.nextLine();

        System.out.print("Enter Treatment: ");
        String treatment = scanner.nextLine();

        System.out.print("Enter Treatment Date: ");
        String date = scanner.nextLine();

        TreatmentRecord record =
                new TreatmentRecord(
                        treatmentId,
                        patientId,
                        patientName,
                        doctorName,
                        treatment,
                        date
                );

        treatmentStack.push(record);
    }

    // =========================================
    // REMOVE LATEST TREATMENT
    // =========================================

    static void removeLatestTreatment() {

        System.out.println(
                "\n===== REMOVE LATEST TREATMENT ====="
        );

        TreatmentRecord record =
                treatmentStack.pop();

        if (record != null) {

            System.out.println(
                    "Removed treatment record:"
            );

            record.displayTreatment();
        }
    }

    // =========================================
    // DISPLAY TREATMENT HISTORY
    // =========================================

    static void displayTreatmentHistory() {

        treatmentStack.displayStack();
    }

    // =========================================
    // ADD VISIT
    // =========================================

    static void addVisit() {

        System.out.println(
                "\n===== ADD PATIENT VISIT ====="
        );

        int visitId =
                getInt("Enter Visit ID: ");

        System.out.print("Enter Visit Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = scanner.nextLine();

        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Enter Treatment: ");
        String treatment = scanner.nextLine();

        Visit visit =
                new Visit(
                        visitId,
                        date,
                        doctor,
                        diagnosis,
                        treatment
                );

        visitHistory.addVisit(visit);
    }

    // =========================================
    // SEARCH VISIT
    // =========================================

    static void searchVisit() {

        System.out.println(
                "\n===== SEARCH VISIT ====="
        );

        int id =
                getInt("Enter Visit ID: ");

        Visit visit =
                visitHistory.searchVisit(id);

        if (visit != null) {

            System.out.println("Visit found:");
            visit.displayVisit();

        } else {

            System.out.println(
                    "Visit ID " + id + " not found."
            );
        }
    }

    // =========================================
    // REMOVE VISIT
    // =========================================

    static void removeVisit() {

        System.out.println(
                "\n===== REMOVE VISIT ====="
        );

        int id =
                getInt("Enter Visit ID: ");

        visitHistory.removeVisit(id);
    }

    // =========================================
    // DISPLAY VISIT HISTORY
    // =========================================

    static void displayVisitHistory() {

        visitHistory.displayHistory();
    }

    // =========================================
    // GET INTEGER INPUT
    // =========================================

    static int getInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                int value =
                        Integer.parseInt(
                                scanner.nextLine()
                        );

                return value;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }
        }
    }
}
