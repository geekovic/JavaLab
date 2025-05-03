public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // ArithmeticException: divide by zero
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);

            // ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing 4th element: " + numbers[3]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());

        } finally {
            System.out.println("This block always executes (finally).");
        }

        System.out.println("Program continues after exception handling.");
    }
}
