package Arraaaays;

public class arrprint {
    public static void main(String[] args) {

        //printing the array
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        //reversing the array
        for (int j = arr.length-1; j>=0; j--) {
            System.out.println(" "+arr[j]);
        }

        //another method of printing all element in an array
        for(int x:arr) System.out.print(" "+x);
    }
}
