package Arraaaays;

public class inserting {
    public static void main(String[] args) {
        int [] ar={1,2,3,4,5,6,7,8};

        int pos=5;
        int ins=9;

        for(int i=ar.length-1; i<pos-1; i--){
            ar[i] = ar[i-1]; //Value of 8th index will be now in index7 ; the condition will go on

        }
        ar[pos-1]=ins;
        for(int x=0; x<ar.length; x++){
            System.out.print(" "+ar[x]);
        }

    }
}
