import java.util.Scanner;

public class Program {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        return isPrime;
    }
    
    public static void main (String [] args) {
        boolean isPrime = true;
        int counter = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("-->  ");
        String line = scanner.nextLine();
        scanner.close();
        
        int number = Integer.parseInt(line);
        
        if (number <= 1) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        /*  num = 7 case: 
                Check 1 (for i=2): 4 <= 7 is true. The loop runs, and iterations becomes 1.
                Check 2 (for i=3): 9 <= 7 is false. The loop stops.
        */
        for (int i = 2; i * i <= number; i++) {
            counter++;
            
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        /*  */
        if (isPrime) counter++;
        System.out.println(isPrime + " " + counter);
        
    }
}