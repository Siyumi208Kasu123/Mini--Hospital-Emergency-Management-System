package hospital;

public class QueueTest {

    public static void main(String[] args) {

        // =========================================
        // CREATE THE EMERGENCY QUEUE
        // =========================================
        EmergencyQueue emergencyQueue =
                new EmergencyQueue();

        // =========================================
        // CREATE PATIENTS
        // =========================================

        Patient patient1 = new Patient(
                201,
                "Kasun Perera",
                35,
                "0711111111",
                "Chest Pain"
        );

        Patient patient2 = new Patient(
                202,
                "Nimal Silva",
                42,
                "0722222222",
                "High Fever"
        );

        Patient patient3 = new Patient(
                203,
                "Amal Fernando",
                29,
                "0733333333",
                "Asthma"
        );

        // =========================================
        // ENQUEUE PATIENTS
        // =========================================

        System.out.println("========================================");
        System.out.println("   ADDING PATIENTS TO EMERGENCY QUEUE");
        System.out.println("========================================");

        emergencyQueue.enqueue(patient1);
        emergencyQueue.enqueue(patient2);
        emergencyQueue.enqueue(patient3);

        // =========================================
        // DISPLAY ALL WAITING PATIENTS
        // =========================================

        System.out.println();
        System.out.println("DISPLAYING ALL WAITING PATIENTS");

        emergencyQueue.displayQueue();

        // =========================================
        // DEQUEUE FIRST PATIENT
        // =========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("       FIRST DEQUEUE OPERATION");
        System.out.println("========================================");

        Patient nextPatient = emergencyQueue.dequeue();

        if (nextPatient != null) {

            System.out.println("Patient selected for treatment:");
            nextPatient.displayPatient();
        }

        // =========================================
        // DISPLAY QUEUE AFTER DEQUEUE
        // =========================================

        System.out.println();
        System.out.println("QUEUE AFTER FIRST DEQUEUE:");

        emergencyQueue.displayQueue();

        // =========================================
        // DEQUEUE SECOND PATIENT
        // =========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("       SECOND DEQUEUE OPERATION");
        System.out.println("========================================");

        emergencyQueue.dequeue();

        System.out.println();
        System.out.println("QUEUE AFTER SECOND DEQUEUE:");

        emergencyQueue.displayQueue();

        // =========================================
        // DEQUEUE THIRD PATIENT
        // =========================================

        System.out.println();
        System.out.println("========================================");
        System.out.println("       THIRD DEQUEUE OPERATION");
        System.out.println("========================================");

        emergencyQueue.dequeue();

        // =========================================
        // DISPLAY EMPTY QUEUE
        // =========================================

        System.out.println();
        System.out.println("DISPLAYING QUEUE AFTER ALL PATIENTS ARE REMOVED:");

        emergencyQueue.displayQueue();

        // =========================================
        // TEST DEQUEUE ON EMPTY QUEUE
        // =========================================

        System.out.println();
        System.out.println("TESTING EMPTY QUEUE:");

        emergencyQueue.dequeue();
    }
}