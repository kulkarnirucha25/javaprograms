import java.util.Scanner;

public class BankTest {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        BankAccount b = new BankAccount(5000);

        try{

            b.balanceEnquiry();

            System.out.println("Enter Deposit Amount:");
            double d = sc.nextDouble();
            b.deposit(d);

            System.out.println("Enter Withdraw Amount:");
            double w = sc.nextDouble();
            b.withdraw(w);

            b.balanceEnquiry();

        }

        catch(NegativeNumberException e){
            System.out.println(e.getMessage());
        }

        catch(LowBalanceException e){
            System.out.println(e.getMessage());
        }

    }

}