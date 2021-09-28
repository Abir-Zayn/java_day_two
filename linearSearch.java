package Arraaaays;

public class linearSearch {
    public static void main(String[] args) {
        //searching for a value in an array
        int[]arrgs={1,2,3,4,5,6,7,8,9,10};
        int key=11;

        for(int i = 0; i < arrgs.length; i++){
            if(arrgs[i] == key){
                System.out.println("Found the value at" +i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
