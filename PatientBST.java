package hospital;

public class PatientBST {

    // Node class
    class Node {

        Patient patient;
        Node left;
        Node right;

        // Constructor
        Node(Patient patient) {
            this.patient = patient;
            this.left = null;
            this.right = null;
        }
    }

    // Root of the BST
    private Node root;

    // ==========================================
    // INSERT PATIENT
    // ==========================================

    public void insert(Patient patient) {

        root = insertRecursive(root, patient);

    }

    private Node insertRecursive(Node current, Patient patient) {

        // If the tree is empty
        if (current == null) {

            return new Node(patient);
        }

        // Smaller Patient ID goes to the left
        if (patient.patientId < current.patient.patientId) {

            current.left = insertRecursive(current.left, patient);

        }

        // Larger Patient ID goes to the right
        else if (patient.patientId > current.patient.patientId) {

            current.right = insertRecursive(current.right, patient);

        }

        // Duplicate Patient ID
        else {

            System.out.println("Patient ID already exists: "
                    + patient.patientId);
        }

        return current;
    }

    // ==========================================
    // SEARCH PATIENT
    // ==========================================

    public Patient search(int patientId) {

        Node result = searchRecursive(root, patientId);

        if (result != null) {

            return result.patient;
        }

        return null;
    }

    private Node searchRecursive(Node current, int patientId) {

        // Patient not found
        if (current == null) {

            return null;
        }

        // Patient found
        if (current.patient.patientId == patientId) {

            return current;
        }

        // Search left side
        if (patientId < current.patient.patientId) {

            return searchRecursive(current.left, patientId);
        }

        // Search right side
        return searchRecursive(current.right, patientId);
    }

    // ==========================================
    // DELETE PATIENT
    // ==========================================

    public void delete(int patientId) {

        // Check whether patient exists
        if (search(patientId) == null) {

            System.out.println("Patient ID " + patientId
                    + " not found.");

            return;
        }

        root = deleteRecursive(root, patientId);

        System.out.println("Patient ID " + patientId
                + " deleted successfully.");
    }

    private Node deleteRecursive(Node current, int patientId) {

        // Patient not found
        if (current == null) {

            return null;
        }

        // Search left side
        if (patientId < current.patient.patientId) {

            current.left =
                    deleteRecursive(current.left, patientId);
        }

        // Search right side
        else if (patientId > current.patient.patientId) {

            current.right =
                    deleteRecursive(current.right, patientId);
        }

        // Patient found
        else {

            // Case 1: No children
            if (current.left == null &&
                current.right == null) {

                return null;
            }

            // Case 2: Only right child
            if (current.left == null) {

                return current.right;
            }

            // Case 3: Only left child
            if (current.right == null) {

                return current.left;
            }

            // Case 4: Two children
            Node smallestNode =
                    findSmallest(current.right);

            // Replace current patient
            current.patient = smallestNode.patient;

            // Delete duplicate node
            current.right =
                    deleteRecursive(
                            current.right,
                            smallestNode.patient.patientId
                    );
        }

        return current;
    }

    // ==========================================
    // FIND SMALLEST NODE
    // ==========================================

    private Node findSmallest(Node current) {

        while (current.left != null) {

            current = current.left;
        }

        return current;
    }

    // ==========================================
    // IN-ORDER TRAVERSAL
    // ==========================================

    public void displayInOrder() {

        if (root == null) {

            System.out.println("No patient records available.");

            return;
        }

        System.out.println();
        System.out.println("======================================");
        System.out.println("   PATIENT RECORDS - IN-ORDER");
        System.out.println("======================================");

        inOrder(root);
    }

    private void inOrder(Node current) {

        if (current != null) {

            // Visit left subtree
            inOrder(current.left);

            // Display current patient
            current.patient.displayPatient();

            // Visit right subtree
            inOrder(current.right);
        }
    }
}