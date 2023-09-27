import java.util.Scanner;

public class SigDigitsBD {

    public static void main(String[] args) {
        while (true) {
    Scanner myfloat = new Scanner(System.in);
    System.out.print("Enter Number: ");

            String Input = myfloat.nextLine();

                String [] sig_dig = Input.split("(^0+(\\.?)0*|(~\\.)0+$|\\.)");

                    int sum = 0;


            for (String digits : sig_dig)
                 {
                 sum += digits.length();
                 }
                     System.out.println("The Number of Signiicant digits is: " + sum);
                     System.out.println("");
                     System.out.println("Run Again? yes/no");
                     Scanner Scanner = new Scanner(System.in);
                     String again = Scanner.nextLine();
                     System.out.println("");
                     if (again.equals("no")) {
                     break;
                     }
                    }

                 
    }
}