import java.util.Scanner;

/* 
    * Absolute correctness of data is guaranteed, 
        except for sequential ordering of classes when populating the timetable
*/

public class Program {
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        System.out.println(line);
        scanner.close();
    }
}