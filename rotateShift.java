package Arraaaays;

public class rotateShift {
    public static void main(String[] args) {

        //rotating from left
        int []arr={1,2,3,4,5,6,7,8};
        int temp=arr[0];
        int i=1;

        for( i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1]=temp;

        for(int x:arr) System.out.print(" "+x);
        System.out.println(" ");

        //rotating from right
         int[]ark={1,2,3,4,5,6,7,8};
        int tempo=ark[ark.length-1];
        for(int j=ark.length - 1; j>0; j--){
            ark[j]=ark[j-1];
        }
        ark[0]=tempo;

        for(int y:ark) System.out.print(" "+y);


    }

}
