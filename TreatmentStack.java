package hospital;

public class TreatmentStack {

    // Node class for the Stack
    class StackNode {

        TreatmentRecord treatmentRecord;
        StackNode next;

        // Constructor
        StackNode(TreatmentRecord treatmentRecord) {
            this.treatmentRecord = treatmentRecord;
            this.next = null;
        }
    }

    // Top of the stack
    private StackNode top;

    // Constructor
    public TreatmentStack() {
        top = null;
    }

    // =========================================
    // PUSH
    // Add completed treatment to the stack
    // =========================================

    public void push(TreatmentRecord treatmentRecord) {

        StackNode newNode =
                new StackNode(treatmentRecord);

        // New record becomes the top
        newNode.next = top;
        top = newNode;

        System.out.println(
                "Treatment ID "
                + treatmentRecord.treatmentId
                + " added to treatment history."
        );
    }

    // =========================================
    // POP
    // Remove most recently completed treatment
    // =========================================

    public TreatmentRecord pop() {

        // Check whether stack is empty
        if (top == null) {

            System.out.println(
                    "Treatment history stack is empty."
            );

            return null;
        }

        // Store the top treatment
        TreatmentRecord removedRecord =
                top.treatmentRecord;

        // Move top to the next record
        top = top.next;

        System.out.println(
                "Treatment ID "
                + removedRecord.treatmentId
                + " removed from treatment history."
        );

        return removedRecord;
    }

    // =========================================
    // DISPLAY STACK
    // =========================================

    public void displayStack() {

        // Check whether stack is empty
        if (top == null) {

            System.out.println(
                    "Treatment history stack is empty."
            );

            return;
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("        TREATMENT HISTORY STACK");
        System.out.println("========================================");

        StackNode current = top;

        // Display from top to bottom
        while (current != null) {

            current.treatmentRecord.displayTreatment();

            current = current.next;
        }
    }

    // =========================================
    // CHECK IF STACK IS EMPTY
    // =========================================

    public boolean isEmpty() {

        return top == null;
    }
}