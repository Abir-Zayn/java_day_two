package Arraaaays;

public class deletionEle {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5,6,7,8,9,10};
        int delete=21;

        int count=0;

        for(int i=0; i<arr.length; i++){
            if(delete==arr[i]){
                for(int j=i; j<arr.length-1; j++){
                    arr[j] = arr[j+1];
                }
                count=count+1;
                break;
            }

        }
        if(count==0) {
            System.out.print("Element is not present in array.");
            System.exit(0);
        }
        for(int i=0; i<arr.length-1; i++) System.out.print(" "+arr[i]);
    }
}
