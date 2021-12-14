package RecursiveMethodFactorial;

import java.util.Scanner;


class recursion{
    public int Rtest(int n){

        if(n == 0 || n==1){
            return 1;
        }
        return n * Rtest(n - 1);
    }

}

public class recursivceFact {
    public static void main(String[] args) {
        recursion re = new recursion();
        System.out.println("Enter the number to calculate its factorial:: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The factorial of "+n+" "+"is "+ re.Rtest(n) );
    }
}
