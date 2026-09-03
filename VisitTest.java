package hospital;

public class VisitTest {

    public static void main(String[] args) {

        // =========================================
        // CREATE PATIENT VISIT HISTORY
        // =========================================

        VisitLinkedList visitHistory =
                new VisitLinkedList();

        // =========================================
        // CREATE VISITS
        // =========================================

        Visit visit1 = new Visit(
                401,
                "10-06-2026",
                "Dr. Silva",
                "Fever",
                "Medication and rest"
        );

        Visit visit2 = new Visit(
                402,
                "20-07-2026",
                "Dr. Fernando",
                "Asthma",
                "Inhaler treatment"
        );

        Visit visit3 = new Visit(
                403,
                "01-09-2026",
                "Dr. Perera",
                "Chest Pain",
                "Medical observation"
        );

        // =========================================
        // ADD VISITS
        // =========================================

        System.out.println(
                "========================================"
        );

        System.out.println(
                "       ADDING PATIENT VISITS"
        );

        System.out.println(
                "========================================"
        );

        visitHistory.addVisit(visit1);
        visitHistory.addVisit(visit2);
        visitHistory.addVisit(visit3);

        // =========================================
        // DISPLAY VISIT HISTORY
        // =========================================

        System.out.println();

        System.out.println(
                "DISPLAYING PATIENT VISIT HISTORY:"
        );

        visitHistory.displayHistory();

        // =========================================
        // SEARCH FOR A VISIT
        // =========================================

        System.out.println();

        System.out.println(
                "========================================"
        );

        System.out.println(
                "          SEARCH VISIT"
        );

        System.out.println(
                "========================================"
        );

        int searchId = 402;

        Visit foundVisit =
                visitHistory.searchVisit(searchId);

        if (foundVisit != null) {

            System.out.println(
                    "Visit found:"
            );

            foundVisit.displayVisit();

        } else {

            System.out.println(
                    "Visit ID " + searchId
                    + " not found."
            );
        }

        // =========================================
        // REMOVE A VISIT
        // =========================================

        System.out.println();

        System.out.println(
                "========================================"
        );

        System.out.println(
                "          REMOVE VISIT"
        );

        System.out.println(
                "========================================"
        );

        visitHistory.removeVisit(402);

        // =========================================
        // DISPLAY AFTER REMOVAL
        // =========================================

        System.out.println();

        System.out.println(
                "VISIT HISTORY AFTER REMOVAL:"
        );

        visitHistory.displayHistory();

        // =========================================
        // TEST EMPTY LIST
        // =========================================

        System.out.println();

        System.out.println(
                "Checking whether visit history is empty:"
        );

        if (visitHistory.isEmpty()) {

            System.out.println(
                    "Visit history is empty."
            );

        } else {

            System.out.println(
                    "Visit history contains records."
            );
        }
    }
}