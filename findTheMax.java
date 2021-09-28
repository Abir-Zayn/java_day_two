package Arraaaays;

public class findTheMax {
    public static void main(String[] args) {
        //finding the max value;
        int[]arr={1,2,3,4,5};
        int max=arr[0];
        int max_two=arr[0];
        int max_three=arr[0];


        for (int i=0; i < arr.length; i++){
            if(arr[i]>max){
                max_three=max_two;
                max_two = max;
                max=arr[i];
            }
            else if(arr[i]> max_two){
                max_three=max_two;
                max_two= arr[i];
            }
            else if (arr[i]> max_three) {
                max_three=arr[i];
            }


        }
        System.out.println(" "+max);
        System.out.println(" "+max_two);
        System.out.println(" "+max_three);
    }
}
