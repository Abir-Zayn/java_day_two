package RecursiveMethodFactorial;

import java.util.Scanner;

//Recursion method been created in this class
class recursion{
    
    //recursive method
    public int Rtest(int n){

        if(n == 0 || n==1){
            return 1;
        }
        // recursive :- method call itself within itself.
        return n * Rtest(n - 1);
    }

}

public class recursivceFact {
    public static void main(String[] args) {
        //object created
        recursion re = new recursion();
        System.out.println("Enter the number to calculate its factorial:: ");
        Scanner sc = new Scanner(System.in);
        // enter numbers to get its factorial numbers
        
        int n=sc.nextInt();
        System.out.println("The factorial of "+n+" "+"is "+ re.Rtest(n) );
    }
}
