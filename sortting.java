package Arraaaays;

public class sortting {
    public static void main(String[] args) {

        int []arr={5,7,9,10,14,12,2,13,1,4};
        int temp=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] <arr[j]){
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int x:arr) System.out.print(" "+x);
    }
}
