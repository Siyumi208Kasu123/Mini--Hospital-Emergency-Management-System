package hospital;

public class TestBST {

    public static void main(String[] args) {

        // Create BST
        PatientBST patientTree = new PatientBST();

        // ==========================================
        // INSERT PATIENTS
        // ==========================================

        Patient patient1 = new Patient(
                105,
                "Kamal Perera",
                45,
                "0712345678",
                "Heart Problem"
        );

        Patient patient2 = new Patient(
                101,
                "Nimal Silva",
                32,
                "0723456789",
                "Fever"
        );

        Patient patient3 = new Patient(
                110,
                "Saman Fernando",
                56,
                "0774567890",
                "Diabetes"
        );

        Patient patient4 = new Patient(
                103,
                "Amal Perera",
                28,
                "0755678901",
                "Asthma"
        );

        Patient patient5 = new Patient(
                108,
                "Kasun Bandara",
                40,
                "0766789012",
                "Fracture"
        );

        // Add patients to BST
        patientTree.insert(patient1);
        patientTree.insert(patient2);
        patientTree.insert(patient3);
        patientTree.insert(patient4);
        patientTree.insert(patient5);

        // ==========================================
        // DISPLAY ALL PATIENTS
        // ==========================================

        System.out.println("PATIENT RECORDS AFTER INSERTION");

        patientTree.displayInOrder();

        // ==========================================
        // SEARCH PATIENT
        // ==========================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("       SEARCH PATIENT");
        System.out.println("======================================");

        int searchId = 103;

        Patient foundPatient = patientTree.search(searchId);

        if (foundPatient != null) {

            System.out.println("Patient found:");
            foundPatient.displayPatient();

        } else {

            System.out.println(
                    "Patient ID " + searchId + " not found."
            );
        }

        // ==========================================
        // DELETE PATIENT
        // ==========================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("       DELETE PATIENT");
        System.out.println("======================================");

        patientTree.delete(101);

        // ==========================================
        // DISPLAY AFTER DELETE
        // ==========================================

        System.out.println();
        System.out.println("PATIENT RECORDS AFTER DELETION");

        patientTree.displayInOrder();
    }
}
