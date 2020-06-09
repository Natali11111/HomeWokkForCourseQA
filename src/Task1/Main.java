package Task1;


import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];


        int count = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(0+(Math.random()*(100-90)));
            if(arr[i] % 2== 0){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }



}
