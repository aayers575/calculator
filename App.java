import java.util.Scanner;
public class App {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
        Double num1 = getDouble("First number?") ;
        Double num2 = getDouble("Second number?") ;
        Calculator one = new Calculator();
        Double plus = one.add(num1,num2);
        Double minus = one.subtract(num1,num2);
        Double times = one.multiply(num1,num2);
        Double division = one.divide(num1,num2);
        String add = String.format("%.1f + %.1f = %.1f", num1, num2, plus);
        String subtract = String.format("%.1f + %.1f = %.1f", num1, num2, minus);
        String multiply = String.format("%.1f + %.1f = %.1f", num1, num2, times);
        String divide = String.format("%.1f + %.1f = %.1f", num1, num2, division);
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);

        String status = getString("Would you like to continue? (y/n)") ;

        if(status.equals("n")){
            System.out.println("Goodbye");
            break;
        }

        }
    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        String response = (scanner.nextLine());
        return response;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        Double dub = Double.valueOf(scanner.nextLine());
        return dub;
    }
}