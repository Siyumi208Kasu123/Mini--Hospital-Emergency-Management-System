package hospital;

public class EmergencyQueue {

    // Node class used to store each patient in the queue
    class QueueNode {

        Patient patient;
        QueueNode next;

        // Constructor
        QueueNode(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    // Front points to the first patient
    // Rear points to the last patient
    private QueueNode front;
    private QueueNode rear;

    // Constructor
    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    // =========================================
    // ENQUEUE - Add a patient to the queue
    // =========================================
    public void enqueue(Patient patient) {

        QueueNode newNode = new QueueNode(patient);

        // If the queue is empty
        if (front == null) {

            front = newNode;
            rear = newNode;

        } else {

            // Add the new patient at the rear
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Patient ID " + patient.patientId
                + " added to the emergency queue.");
    }

    // =========================================
    // DEQUEUE - Remove the first patient
    // =========================================
    public Patient dequeue() {

        // Check whether the queue is empty
        if (front == null) {

            System.out.println(
                    "Emergency queue is empty. No patient to treat."
            );

            return null;
        }

        // Get the patient at the front
        Patient removedPatient = front.patient;

        // Move front to the next patient
        front = front.next;

        // If the queue is now empty
        if (front == null) {
            rear = null;
        }

        System.out.println("Patient ID "
                + removedPatient.patientId
                + " removed for treatment.");

        return removedPatient;
    }

    // =========================================
    // DISPLAY ALL WAITING PATIENTS
    // =========================================
    public void displayQueue() {

        // Check whether the queue is empty
        if (front == null) {

            System.out.println("Emergency queue is empty.");

            return;
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("       EMERGENCY PATIENT QUEUE");
        System.out.println("========================================");

        QueueNode current = front;

        // Move from front to rear
        while (current != null) {

            current.patient.displayPatient();

            current = current.next;
        }
    }

    // =========================================
    // CHECK IF QUEUE IS EMPTY
    // =========================================
    public boolean isEmpty() {

        return front == null;
    }
}