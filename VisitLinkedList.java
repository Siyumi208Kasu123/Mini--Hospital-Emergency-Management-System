package hospital;

public class VisitLinkedList {

    // Head points to the first visit
    private Visit head;

    // Constructor
    public VisitLinkedList() {
        head = null;
    }

    // =========================================
    // ADD NEW VISIT
    // =========================================

    public void addVisit(Visit newVisit) {

        // If the list is empty
        if (head == null) {

            head = newVisit;

        } else {

            // Start from the first visit
            Visit current = head;

            // Move to the last visit
            while (current.next != null) {

                current = current.next;
            }

            // Add new visit at the end
            current.next = newVisit;
        }

        System.out.println(
                "Visit ID " + newVisit.visitId
                + " added successfully."
        );
    }

    // =========================================
    // REMOVE VISIT
    // =========================================

    public void removeVisit(int visitId) {

        // Check if list is empty
        if (head == null) {

            System.out.println(
                    "Visit history is empty."
            );

            return;
        }

        // If the first visit needs to be removed
        if (head.visitId == visitId) {

            head = head.next;

            System.out.println(
                    "Visit ID " + visitId
                    + " removed successfully."
            );

            return;
        }

        // Search for the visit
        Visit current = head;

        while (current.next != null
                && current.next.visitId != visitId) {

            current = current.next;
        }

        // Visit found
        if (current.next != null) {

            current.next = current.next.next;

            System.out.println(
                    "Visit ID " + visitId
                    + " removed successfully."
            );

        } else {

            System.out.println(
                    "Visit ID " + visitId
                    + " not found."
            );
        }
    }

    // =========================================
    // SEARCH FOR A VISIT
    // =========================================

    public Visit searchVisit(int visitId) {

        Visit current = head;

        while (current != null) {

            if (current.visitId == visitId) {

                return current;
            }

            current = current.next;
        }

        return null;
    }

    // =========================================
    // DISPLAY VISIT HISTORY
    // =========================================

    public void displayHistory() {

        // Check if list is empty
        if (head == null) {

            System.out.println(
                    "Visit history is empty."
            );

            return;
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("          PATIENT VISIT HISTORY");
        System.out.println("========================================");

        Visit current = head;

        while (current != null) {

            current.displayVisit();

            current = current.next;
        }
    }

    // =========================================
    // CHECK IF LIST IS EMPTY
    // =========================================

    public boolean isEmpty() {

        return head == null;
    }
}
