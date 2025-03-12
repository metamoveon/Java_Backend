import java.util.Scanner;

public class AverageOfTenNumber {
    public static void main(String[]args){
        double sum = 0.0;
        int n = 10;
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i<n ; i++) {
            System.out.println("Enter Number : ");
            double input = Double.parseDouble(sc.nextLine());
            sum += input;
            
        }
        System.out.println("Average of Number is :"+(sum/n));
        sc.close();

    }
}