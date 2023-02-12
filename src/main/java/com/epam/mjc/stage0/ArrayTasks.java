package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons  = {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        return seasons;
    }
    public int[] generateNumbers(int length) {
        if(length<=0){}
        else{
        }
        int[] arr1 = new int[length];
        for (int x = 0; x<length;x++){
            arr1[x] = x+1;
            System.out.println(arr1[x]);
        }
        return arr1;
    }
    public int totalSum(int[] arr) {
        int sum = 0;
        int a = arr.length;
        for (int i = 0; i<a;i++){
            sum += arr[i];
        }
        return sum;

    }
    public int findIndexOfNumber(int[] arr, int number) {
        int a = arr.length;
        int thatNumber=0;
        for(int i = 0 ; i<a; i++){
            if(arr[i] == number){
                thatNumber = i;
            }
        }
        return thatNumber;
    }
    public String[] reverseArray(String[] arr) {
        int a = arr.length;
        String thatNumber = "";
        for (int i = 0; i<a; i++){
            thatNumber = arr[a-i];
            arr[i]=arr[a-i];
            arr[i] = thatNumber;

        }
        return arr;

    }
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int a = arr.length;
        int thatNumber = 0;
        int j = 0;
        for(int i = 0; i<a; i++){
            if(arr[i]<0){
                thatNumber = arr[a-i];
                arr[i]=arr[a-i];
                arr[i] = thatNumber;
                j +=1;
            }
        }
        j = a-j;
        int[]arr1 =new int [j];
        for (int i = 0; i<j; i ++){
            arr1[i] = arr[i];
        }
        return arr1;

    }
    public int[][] sortRaggedArray(int[][] arr) {
        return arr;

    }
}
