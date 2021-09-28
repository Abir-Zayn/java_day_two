package Arraaaays;

public class arrysTraverse {
    public static void main(String[] args) {
        int[]ar={1,3,5,7,9,12,14,17,19,22};
        //read-"Data Structure"Operation
        for(int x:ar) System.out.print(" "+x);
        System.out.println();

        //modifying the array values
        ar[0]=2;
        ar[1]=4;
        ar[2]=6;
        for(int y:ar) System.out.print(" "+y);
        System.out.println();

        //increamenting all elements in array by 2
        for(int i=0; i<ar.length; i++) System.out.print(" "+ (ar[i]+2));
    }
}
