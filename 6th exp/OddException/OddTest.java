import java.util.Scanner;

public class OddTest {

    static void checkNumber(int n)
    throws OddNumberException{

        if(n % 2 != 0)
            throw new OddNumberException("Number is Odd");

        else
            System.out.println("Number is Even");

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");

        int n = sc.nextInt();

        try{

            checkNumber(n);

        }

        catch(OddNumberException e){

            System.out.println(e.getMessage());

        }

    }

}