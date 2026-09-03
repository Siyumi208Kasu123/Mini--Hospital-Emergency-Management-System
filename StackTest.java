package hospital;

public class StackTest {

    public static void main(String[] args) {

        // =========================================
        // CREATE TREATMENT STACK
        // =========================================

        TreatmentStack treatmentStack =
                new TreatmentStack();

        // =========================================
        // CREATE TREATMENT RECORDS
        // =========================================

        TreatmentRecord record1 =
                new TreatmentRecord(
                        301,
                        201,
                        "Kasun Perera",
                        "Dr. Silva",
                        "Emergency treatment",
                        "01-09-2026"
                );

        TreatmentRecord record2 =
                new TreatmentRecord(
                        302,
                        202,
                        "Nimal Silva",
                        "Dr. Fernando",
                        "Fever treatment",
                        "01-09-2026"
                );

        TreatmentRecord record3 =
                new TreatmentRecord(
                        303,
                        203,
                        "Amal Fernando",
                        "Dr. Perera",
                        "Asthma treatment",
                        "01-09-2026"
                );

        // =========================================
        // PUSH TREATMENT RECORDS
        // =========================================

        System.out.println(
                "========================================"
        );

        System.out.println(
                "      ADDING COMPLETED TREATMENTS"
        );

        System.out.println(
                "========================================"
        );

        treatmentStack.push(record1);
        treatmentStack.push(record2);
        treatmentStack.push(record3);

        // =========================================
        // DISPLAY STACK
        // =========================================

        System.out.println();
        System.out.println(
                "DISPLAYING TREATMENT HISTORY:"
        );

        treatmentStack.displayStack();

        // =========================================
        // POP FIRST RECORD
        // =========================================

        System.out.println();
        System.out.println(
                "========================================"
        );

        System.out.println(
                "          FIRST POP OPERATION"
        );

        System.out.println(
                "========================================"
        );

        TreatmentRecord removedRecord =
                treatmentStack.pop();

        if (removedRecord != null) {

            System.out.println(
                    "Removed treatment record:"
            );

            removedRecord.displayTreatment();
        }

        // =========================================
        // DISPLAY AFTER FIRST POP
        // =========================================

        System.out.println();
        System.out.println(
                "STACK AFTER FIRST POP:"
        );

        treatmentStack.displayStack();

        // =========================================
        // POP SECOND RECORD
        // =========================================

        System.out.println();
        System.out.println(
                "========================================"
        );

        System.out.println(
                "          SECOND POP OPERATION"
        );

        System.out.println(
                "========================================"
        );

        treatmentStack.pop();

        // =========================================
        // DISPLAY AFTER SECOND POP
        // =========================================

        System.out.println();
        System.out.println(
                "STACK AFTER SECOND POP:"
        );

        treatmentStack.displayStack();

        // =========================================
        // POP THIRD RECORD
        // =========================================

        System.out.println();
        System.out.println(
                "========================================"
        );

        System.out.println(
                "          THIRD POP OPERATION"
        );

        System.out.println(
                "========================================"
        );

        treatmentStack.pop();

        // =========================================
        // DISPLAY EMPTY STACK
        // =========================================

        System.out.println();
        System.out.println(
                "STACK AFTER ALL RECORDS ARE REMOVED:"
        );

        treatmentStack.displayStack();

        // =========================================
        // TEST EMPTY STACK
        // =========================================

        System.out.println();
        System.out.println(
                "TESTING EMPTY STACK:"
        );

        treatmentStack.pop();
    }
}