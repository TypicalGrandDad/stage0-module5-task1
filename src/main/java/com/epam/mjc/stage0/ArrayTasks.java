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
        String newNumber = "";
        for (int i = 1; i<a;i++){
            newNumber = arr[i-1];
            arr[i-1] = arr[a-i];
            arr[a-i] = newNumber;
            if(i==a-2){
                break;
            }

        }
        for (int i = 0; i<a;i++){
            System.out.println(arr[i]);
        }
        return arr;

    }
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int a = arr.length;
        int newNumber = 0;
        int check = 0;
        for(int i = 0; i<a; i++){
            if(arr[i]<0){
                for (int x = i; x<=a-i+1;x++){
                    newNumber = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = newNumber;
                    if(x==a-2){
                        break;
                    }

                }
            }
        }
        for (int i = 0; i<a;i++){
            if(arr[i]>0){
                check+=1;
            }
        }
        int[] arr1 = new int[check];
        for (int i = 0; i<check;i++){
            arr1[i] = arr[i];
            System.out.println(arr1[i]);
        }
        return arr1;

    }
    public int[][] sortRaggedArray(int[][] arr) {
        return arr;

    }
}
