import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addEmployee(employeeManagement, scanner);
                    break;
                case 2:
                    employeeManagement.showAllEmployees();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }

        scanner.close();
    }

    public static void addEmployee(EmployeeManagement employeeManagement, Scanner scanner) {
        System.out.println("\nAdd Employee:");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
        System.out.print("Enter employee type: ");
        int employeeType = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter ID: ");
        String ID = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter Birth Day: ");
        String birthDay = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        switch (employeeType) {
            case 1:
                System.out.print("Enter Years of Experience: ");
                int expInYear = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Enter Professional Skill: ");
                String proSkill = scanner.nextLine();
                employeeManagement.addEmployee(new Experience(String ID,fullName, birthDay, phone, email, "Experience", expInYear, proSkill));
                break;
            case 2:
                System.out.print("Enter Graduation Date: ");
                String graduationDate = scanner.nextLine();
                System.out.print("Enter Graduation Rank: ");
                String graduationRank = scanner.nextLine();
                System.out.print("Enter Education: ");
                String education = scanner.nextLine();
                employeeManagement.addEmployee(new Fresher(String ID, fullName, birthDay, phone, email, "Fresher", graduationDate, graduationRank, education));
                break;
            case 3:
                System.out.print("Enter Majors: ");
                String majors = scanner.nextLine();
                System.out.print("Enter Semester: ");
                String semester = scanner.nextLine();
                System.out.print("Enter University Name: ");
                String universityName = scanner.nextLine();
                employeeManagement.addEmployee(new Intern(String ID, fullName, birthDay, phone, email, "Intern", majors, semester, universityName));
                break;
            default:
                System.out.println("Invalid employee type.");
        }
    }
}
