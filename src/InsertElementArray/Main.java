package InsertElementArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {10,4,6,7,8,0,0,0,0,0};
        Scanner input = new Scanner(System.in);
        printArray(array);
        System.out.print("Enter the value: ");
        int value = input.nextInt();
        System.out.print("Enter index: ");
        int index = input.nextInt();
        insertElementArray(array,value,index);
        printArray(array);
    }

    public static void insertElementArray(int[] array,int value, int index) {
        if(index > array.length-1){
            System.out.println("Out of Range");
            return;
        }else{
            for (int i = array.length-2; i >= index; i--) {
                array[i+1] = array[i];
            }
            array[index] = value;
        }

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
        System.out.println();
    }
}
