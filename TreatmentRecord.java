package hospital;

public class TreatmentRecord {

    // Treatment record information
    int treatmentId;
    int patientId;
    String patientName;
    String doctorName;
    String treatment;
    String treatmentDate;

    // Constructor
    public TreatmentRecord(int treatmentId,
                           int patientId,
                           String patientName,
                           String doctorName,
                           String treatment,
                           String treatmentDate) {

        this.treatmentId = treatmentId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.treatment = treatment;
        this.treatmentDate = treatmentDate;
    }

    // Display treatment information
    public void displayTreatment() {

        System.out.println("Treatment ID: " + treatmentId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Treatment: " + treatment);
        System.out.println("Treatment Date: " + treatmentDate);
        System.out.println("-----------------------------");
    }
}
