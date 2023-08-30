import java.sql.SQLOutput;
import java.util.Scanner;

public class IncrementCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary = sc.nextDouble();
        System.out.println("current salary " +salary);
        int rating = sc.nextInt();
        System.out.println("rating" + rating);
        if (rating==1){
            System.out.println( 0.75*salary+salary);
        } else if (rating == 2) {
            System.out.println(0.50*salary + salary);
        }
        else {
            System.out.println(0.25*salary + salary);
        }
    }
}
