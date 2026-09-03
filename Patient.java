package hospital;

public class Patient {

    // Patient information
    int patientId;
    String patientName;
    int age;
    String contactNumber;
    String medicalCondition;

    // Constructor
    public Patient(int patientId, String patientName, int age,
                   String contactNumber, String medicalCondition) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.contactNumber = contactNumber;
        this.medicalCondition = medicalCondition;
    }

    // Display patient information
    public void displayPatient() {

        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medical Condition: " + medicalCondition);
        System.out.println("-----------------------------");
    }
}