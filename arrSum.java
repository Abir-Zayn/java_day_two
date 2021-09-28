package Arraaaays;

public class arrSum {
    public static void main(String[] args) {
        arrSumOne();
        arrSumTwo();
    }

    //sum in a defined array
    public static  void arrSumOne(){
        int sum=0;
        int []arr={1,2,3,5,7,9,10};
        for (int i = 0; i <arr.length; i++ ) {
            sum=sum + arr[i];
        }
        System.out.println(sum);
    }

    //sum in a higher and bigger elements of array
    public static void arrSumTwo() {
        int sum=0;
        int[]arr=new int[1000];
        for(int j=0; j<arr.length; j++) {
            arr[j]=j;
        }
        for(int x:arr) sum=sum+x;
        System.out.println(sum);
    }

}
