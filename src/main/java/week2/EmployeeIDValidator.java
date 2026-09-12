package week2;

public class EmployeeIDValidator {

    public static void main(String[] args) {

        String id = "EMP12345";

        if (id.matches("EMP\\d{5}")) {
            System.out.println("Valid Employee ID");
        } else {
            System.out.println("Invalid Employee ID");
        }
    }
}