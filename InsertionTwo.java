package Arraaaays;
import java.util.Arrays;
public class InsertionTwo {


        public static int [] inesertionArray(int n,int arr[],int x,int pos){

            int[] arra =new int[n+1];
            int i;
            for(i=0;i<n+1; i++){
                if(i<pos-1){
                    arra[i]=arr[i];
                }else if(i==pos-1){
                    arra[i]=x;
                }else arra[i]=arr[i-1];
            }
            return arra;
        }


    public static void main(String[] args) {

            int n=11; //initial Array
            int i;

            int post=6; //position
            int element=6; //insertion element
            int []arr={1,2,3,4,5,7,8,9,10,11,12};
            System.out.println("Initial Array");

            for(int x:arr){      //printing initial array
                System.out.println(" "+x);
            }
        int []arrays=inesertionArray(11,arr,element,post);
        System.out.println(Arrays.toString(arrays));

    }
}
