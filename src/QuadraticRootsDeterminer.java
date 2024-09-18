import java.util.Scanner;

public class QuadraticRootsDeterminer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        char continueOption;

        do {
            System.out.println("Enter the coefficients of the quadratic equation (a, b, c):");
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();
            System.out.print("c: ");
            double c = scanner.nextDouble();

            // Calculate the discriminant
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                // Two real and distinct roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Roots are real and distinct:");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
            } else if (discriminant == 0) {
                // Two real and identical roots
                double root = -b / (2 * a);
                System.out.println("Roots are real and identical:");
                System.out.println("Root: " + root);
            } else {
                // Complex roots
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);
                System.out.println("Roots are complex:");
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            continueOption = scanner.next().charAt(0);

        } while (Character.toUpperCase(continueOption) == 'Y');

        System.out.println("Program exited. Thank you!");
        scanner.close();

	}

}
