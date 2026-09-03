package hospital;

public class Visit {

    // Visit information
    int visitId;
    String visitDate;
    String doctorName;
    String diagnosis;
    String treatment;

    // Reference to the next visit
    Visit next;

    // Constructor
    public Visit(int visitId,
                 String visitDate,
                 String doctorName,
                 String diagnosis,
                 String treatment) {

        this.visitId = visitId;
        this.visitDate = visitDate;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.next = null;
    }

    // Display visit information
    public void displayVisit() {

        System.out.println("Visit ID: " + visitId);
        System.out.println("Visit Date: " + visitDate);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
        System.out.println("-----------------------------");
    }
}