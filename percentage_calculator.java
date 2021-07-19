import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args)
    {

        Scanner math = new Scanner(System.in);
        System.out.println("Enter Your Maths Score : ");
       int a  = math.nextInt();

        Scanner history = new Scanner(System.in);
        System.out.println("Enter Your History Score : ");
        int b  = history.nextInt();

        Scanner science = new Scanner(System.in);
        System.out.println("Enter Your Science Score : ");
        int c = science.nextInt();

        Scanner english = new Scanner(System.in);
        System.out.println("Enter Your English Score : ");
        int d  = english.nextInt();

        Scanner geography = new Scanner(System.in);
        System.out.println("Enter Your Geography Score : ");
        int e  = math.nextInt();

        int sum;
        sum = a + b + c + d + e;
        System.out.println(" Total Marks Obtained = " );
        System.out.println(sum);

        float percentage;
        percentage = (sum / 500.0f) * 100;
        System.out.println(" Percentage Obtained = ");
        System.out.println(percentage);


    }
}
